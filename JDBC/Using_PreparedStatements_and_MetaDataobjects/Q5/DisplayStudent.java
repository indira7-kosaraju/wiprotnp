package Q5;

import java.sql.*;

public class DisplayStudent {

    public static void main(String[] args) {

        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@//localhost:1521/XEPDB1",
                    "hr",
                    "hr");

            PreparedStatement ps;

            if (args.length == 1) {

                ps = con.prepareStatement(
                        "SELECT * FROM STUDENT WHERE ROLLNO=?");

                ps.setInt(1, Integer.parseInt(args[0]));

            } else {

                ps = con.prepareStatement(
                        "SELECT * FROM STUDENT");
            }

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                System.out.println(
                        rs.getInt("ROLLNO") + " " +
                        rs.getString("STUDENTNAME") + " " +
                        rs.getString("GRADE") + " " +
                        rs.getDate("DOB") + " " +
                        rs.getInt("FEE"));
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}