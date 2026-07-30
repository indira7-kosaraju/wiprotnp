package mini_project;

import java.sql.*;

public class Scenario6 {

    public String changePassword(String password) {

        try {

            Connection con = DBConnection.getConnection();

            PreparedStatement ps =
                    con.prepareStatement(
                    "UPDATE Users SET Password=? WHERE UserType='Admin'");

            ps.setString(1, password);

            int i = ps.executeUpdate();

            if(i > 0)
                return "Changed";
            else
                return "0";

        } catch(Exception e) {
            e.printStackTrace();
        }

        return "0";
    }

    public static void main(String args[]) {

        Scenario6 obj = new Scenario6();

        System.out.println(
                obj.changePassword("ADMIN123"));
    }
}