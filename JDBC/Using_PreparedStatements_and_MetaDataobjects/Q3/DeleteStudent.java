package Q3;

import java.sql.*;

public class DeleteStudent {

    public static void main(String[] args) {

        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@//localhost:1521/XEPDB1",
                    "hr",
                    "hr");

            int roll = Integer.parseInt(args[0]);

            // Copy student details to StudentLog
            PreparedStatement ps1 = con.prepareStatement(
                "INSERT INTO StudentLog(RollNo, StudentName, Grade, Leaving_Date) " +
                "SELECT RollNo, StudentName, Grade, SYSDATE FROM Student WHERE RollNo=?");

            ps1.setInt(1, roll);
            ps1.executeUpdate();

            // Delete student from Student table
            PreparedStatement ps2 = con.prepareStatement(
                "DELETE FROM Student WHERE RollNo=?");

            ps2.setInt(1, roll);

            int i = ps2.executeUpdate();

            if (i > 0)
                System.out.println("Record Deleted Successfully");
            else
                System.out.println("Record Not Found");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}