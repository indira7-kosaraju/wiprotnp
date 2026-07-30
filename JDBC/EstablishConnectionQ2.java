package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class EstablishConnectionQ2 {

    public static void main(String[] args) {

        Connection con = null;

        try {
            // Class.forName("oracle.jdbc.driver.OracleDriver");

            con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@//localhost:1521/XEPDB1",
                    "hr",
                    "hr");

            System.out.println("Connection Established Successfully");

        } catch (Exception e) {
            System.out.println("Connection could not be established");
            System.out.println(e.getMessage());
        }
    }
}