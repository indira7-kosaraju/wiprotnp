package mini_project;

import java.sql.*;

public class Scenario3 {

    public String changeUserType(String userID) {

        try {

            Connection con=DBConnection.getConnection();

            PreparedStatement ps=
            con.prepareStatement(
            "UPDATE Users SET UserType='Admin' WHERE UserID=?");

            ps.setString(1,userID);

            int i=ps.executeUpdate();

            if(i>0)
                return "Update Success";
            else
                return "Update Failed";

        } catch(Exception e){
            e.printStackTrace();
        }

        return "Update Failed";
    }

    public static void main(String args[]) {

        Scenario3 obj=new Scenario3();

        System.out.println(
                obj.changeUserType("TA1002"));
    }
}