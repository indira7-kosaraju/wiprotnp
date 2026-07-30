package mini_project;

import java.sql.*;

public class Scenario5 {

    public String changeName(String id, String name) {

        try {

            Connection con = DBConnection.getConnection();

            PreparedStatement ps =
                    con.prepareStatement(
                    "UPDATE Users SET Name=? WHERE UserID=?");

            ps.setString(1, name);
            ps.setString(2, id);

            int i = ps.executeUpdate();

            if(i > 0)
                return "Success";
            else
                return "Failed";

        } catch(Exception e) {
            e.printStackTrace();
        }

        return "Failed";
    }

    public static void main(String args[]) {

        Scenario5 obj = new Scenario5();

        System.out.println(
                obj.changeName("TA1002","Prasad"));
    }
}