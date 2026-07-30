package Q2;

import java.sql.*;

public class DeleteStudent {

    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Usage: java Q2.DeleteStudent <RollNo>");
            return;
        }

        int rollNo = Integer.parseInt(args[0]);

        try {

            Class.forName("oracle.jdbc.OracleDriver");

            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@//localhost:1521/XEPDB1",
                    "hr",
                    "hr");

            // Get student details
            PreparedStatement ps1 = con.prepareStatement(
                    "SELECT RollNo, StudentName, Grade FROM Student WHERE RollNo=?");

            ps1.setInt(1, rollNo);

            ResultSet rs = ps1.executeQuery();

            if (rs.next()) {

                // Store details in StudentLog
                PreparedStatement ps2 = con.prepareStatement(
                        "INSERT INTO StudentLog(RollNo, StudentName, Grade, Leaving_Date) VALUES(?,?,?,SYSDATE)");

                ps2.setInt(1, rs.getInt("RollNo"));
                ps2.setString(2, rs.getString("StudentName"));
                ps2.setString(3, rs.getString("Grade"));

                ps2.executeUpdate();

                // Delete from Student
                PreparedStatement ps3 = con.prepareStatement(
                        "DELETE FROM Student WHERE RollNo=?");

                ps3.setInt(1, rollNo);

                int rows = ps3.executeUpdate();

                if (rows > 0)
                    System.out.println("Student Record Deleted Successfully");
                else
                    System.out.println("Student Record Not Found");

                ps2.close();
                ps3.close();

            } else {

                System.out.println("Student Record Not Found");
            }

            rs.close();
            ps1.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}