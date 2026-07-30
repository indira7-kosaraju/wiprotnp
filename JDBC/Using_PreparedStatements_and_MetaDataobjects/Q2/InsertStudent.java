package Q2;

import java.sql.*;

public class InsertStudent {

    public static void main(String[] args) {

        try {

            Class.forName("oracle.jdbc.OracleDriver");

            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@//localhost:1521/XEPDB1",
                    "hr",
                    "hr");

            PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO STUDENT VALUES(?,?,?,?,?)");

            ps.setInt(1, 1001);
            ps.setString(2, "AJIT");
            ps.setString(3, "IV");
            ps.setDate(4, Date.valueOf("2005-06-11"));
            ps.setDouble(5, 4000);

            int i = ps.executeUpdate();

            if (i > 0)
                System.out.println("Row was inserted");
            else
                System.out.println("Insertion Failed");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}