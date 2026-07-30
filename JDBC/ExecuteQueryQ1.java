package JDBC;

import java.sql.*;

public class ExecuteQueryQ1 {

    public static void main(String[] args) {

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@//localhost:1521/XEPDB1",
                    "hr",
                    "hr");

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("SELECT * FROM emp");

            while (rs.next()) {
                System.out.println(
                        rs.getInt(1) + " " +
                        rs.getString("LAST_NAME"));
            }

            rs.close();
            st.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}