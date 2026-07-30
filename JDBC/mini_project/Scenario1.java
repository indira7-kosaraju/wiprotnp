package mini_project;

import java.sql.*;

public class Scenario1 {

    public String getUserType(String userID) {

        try {

            Connection con = DBConnection.getConnection();

            PreparedStatement ps =
                    con.prepareStatement(
                    "SELECT UserType FROM Users WHERE UserID=?");

            ps.setString(1, userID);

            ResultSet rs = ps.executeQuery();

            if(rs.next())
                return rs.getString(1);

        } catch(Exception e) {
            e.printStackTrace();
        }

        return "User Not Found";
    }

    public static void main(String args[]) {

        Scenario1 obj=new Scenario1();

        System.out.println(
                obj.getUserType("AB1001"));
    }
}