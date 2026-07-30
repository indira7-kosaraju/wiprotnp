package mini_project;

import java.sql.*;

public class DBConnection {

    public static Connection getConnection() throws Exception {

        Class.forName("oracle.jdbc.driver.OracleDriver");

        return DriverManager.getConnection(
                "jdbc:oracle:thin:@//localhost:1521/XEPDB1",
                "hr",
                "hr");
    }
}