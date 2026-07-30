package mini_project;

import java.sql.*;

public class Scenario2 {

    public String getIncorrectAttempts(String userID) {

        try {

            Connection con = DBConnection.getConnection();

            PreparedStatement ps =
            con.prepareStatement(
            "SELECT IncorrectAttempts FROM Users WHERE UserID=?");

            ps.setString(1,userID);

            ResultSet rs=ps.executeQuery();

            if(rs.next()) {

                int n=rs.getInt(1);

                if(n==0)
                    return "No Incorrect Attempt";
                else if(n==1)
                    return "One Time";
                else
                    return "Incorrect Attempt Exceeded";
            }

        } catch(Exception e){
            e.printStackTrace();
        }

        return "User Not Found";
    }

    public static void main(String args[]) {

        Scenario2 obj=new Scenario2();

        System.out.println(
                obj.getIncorrectAttempts("AB1001"));
    }
}