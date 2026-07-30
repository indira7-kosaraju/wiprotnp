package mini_project;

import java.sql.*;

public class Scenario7 {

    public String addUser_1(UserBean bean) {

        try {

            Connection con = DBConnection.getConnection();

            PreparedStatement ps = con.prepareStatement(
            "INSERT INTO USERS VALUES(?,?,?,?,?,?)");

            ps.setString(1, bean.getUserID());
            ps.setString(2, bean.getPassword());
            ps.setString(3, bean.getName());
            ps.setInt(4, bean.getIncorrectAttempts());
            ps.setInt(5, bean.getLockStatus());
            ps.setString(6, bean.getUserType());

            int i = ps.executeUpdate();

            if(i>0)
                return "Success";
            else
                return "Fail";

        } catch(Exception e) {
            e.printStackTrace();
        }

        return "Fail";
    }

    public static void main(String args[]) {

        UserBean bean = new UserBean();

        bean.setUserID("AA1004");
        bean.setPassword("AA1004");
        bean.setName("Ramesh");
        bean.setIncorrectAttempts(0);
        bean.setLockStatus(0);
        bean.setUserType("Employee");

        Scenario7 obj = new Scenario7();

        System.out.println(obj.addUser_1(bean));
    }
}