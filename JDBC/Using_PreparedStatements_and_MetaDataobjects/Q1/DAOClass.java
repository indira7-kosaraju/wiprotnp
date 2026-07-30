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

            System.out.println("Database Connected Successfully");

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

    // INSERT
    public void insert(int roll, String name, String course, String dob, int fee) {

        try {

            String sql = "INSERT INTO STUDENT VALUES(?,?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, roll);
            ps.setString(2, name);
            ps.setString(3, course);
            ps.setDate(4, Date.valueOf(dob));
            ps.setInt(5, fee);

            int i = ps.executeUpdate();

            if (i > 0)
                System.out.println("Record Inserted");
            else
                System.out.println("Insertion Failed");

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

    // DELETE
    public void delete(int roll) {

        try {

            String sql = "DELETE FROM STUDENT WHERE ROLLNO=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, roll);

            int i = ps.executeUpdate();

            if (i > 0)
                System.out.println("Record Deleted");
            else
                System.out.println("Record Not Found");

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

    // MODIFY
    public void modify(int roll, int fee) {

        try {

            String sql = "UPDATE STUDENT SET FEE=? WHERE ROLLNO=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, fee);
            ps.setInt(2, roll);

            int i = ps.executeUpdate();

            if (i > 0)
                System.out.println("Record Updated");
            else
                System.out.println("Record Not Found");

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

    // DISPLAY ONE
    public void display(int roll) {

        try {

            String sql = "SELECT * FROM STUDENT WHERE ROLLNO=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, roll);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                System.out.println(
                        rs.getInt(1) + " " +
                        rs.getString(2) + " " +
                        rs.getString(3) + " " +
                        rs.getDate(4) + " " +
                        rs.getInt(5));

            }

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

    // DISPLAY ALL
    public void display() {

        try {

            String sql = "SELECT * FROM STUDENT";

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                System.out.println(
                        rs.getInt(1) + " " +
                        rs.getString(2) + " " +
                        rs.getString(3) + " " +
                        rs.getDate(4) + " " +
                        rs.getInt(5));

            }

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

}