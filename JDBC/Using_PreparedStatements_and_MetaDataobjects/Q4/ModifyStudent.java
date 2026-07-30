package Q4;

import java.sql.*;

public class ModifyStudent {

    public static void main(String[] args) {

        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@//localhost:1521/XEPDB1",
                    "hr",
                    "hr");

            int roll = Integer.parseInt(args[0]);
            int fee = Integer.parseInt(args[1]);

            PreparedStatement ps = con.prepareStatement(
                    "UPDATE STUDENT SET FEE=? WHERE ROLLNO=?");

            ps.setInt(1, fee);
            ps.setInt(2, roll);

            int i = ps.executeUpdate();

            if (i > 0)
                System.out.println("Record Updated Successfully");
            else
                System.out.println("Record Not Found");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}