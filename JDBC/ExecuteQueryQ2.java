package JDBC;

import java.sql.*;

public class ExecuteQueryQ2 {

    public static void main(String[] args) {

        try {
            // Load Oracle Driver
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // Create Connection
            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@//localhost:1521/XEPDB1",
                    "hr",
                    "hr");

            // Create Statement
            Statement st = con.createStatement();

            // Execute Query
            ResultSet rs = st.executeQuery("SELECT * FROM emp");

            // Display Result
            while (rs.next()) {
                System.out.println(
                        "ID: " + rs.getInt("ID") +
                        ", Last Name: " + rs.getString("LAST_NAME") +
                        ", First Name: " + rs.getString("FIRST_NAME") +
                        ", Dept ID: " + rs.getInt("DEPT_ID"));
            }

            rs.close();
            st.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}