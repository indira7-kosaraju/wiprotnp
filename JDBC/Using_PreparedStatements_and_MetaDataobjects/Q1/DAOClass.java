package Q1;

import java.sql.*;

public class DAOClass {

    Connection con;

    public DAOClass() {
        try {
            Class.forName("oracle.jdbc.OracleDriver");

            con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@//localhost:1521/XEPDB1",
                    "hr",
                    "hr");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insert(int rollno, String name, String grade, String dob, int fee) {

        try {
            String sql = "INSERT INTO student VALUES (?, ?, ?, TO_DATE(?, 'DD-MON-YYYY'), ?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, rollno);
            ps.setString(2, name);
            ps.setString(3, grade);
            ps.setString(4, dob);
            ps.setInt(5, fee);

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("Record Inserted Successfully");
            else
                System.out.println("Insertion Failed");

            ps.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}