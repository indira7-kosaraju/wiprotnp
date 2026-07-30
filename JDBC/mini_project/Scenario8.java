package mini_project;

import java.sql.*;

public class Scenario8 {

    public String addUser_2(UserBean bean) {

        try {

            if(bean.getLockStatus()!=0)
                return "Fail";

            Connection con=DBConnection.getConnection();

            PreparedStatement ps=con.prepareStatement(
            "INSERT INTO USERS VALUES(?,?,?,?,?,?)");

            ps.setString(1,bean.getUserID());
            ps.setString(2,bean.getPassword());
            ps.setString(3,bean.getName());
            ps.setInt(4,bean.getIncorrectAttempts());
            ps.setInt(5,bean.getLockStatus());
            ps.setString(6,bean.getUserType());

            int i=ps.executeUpdate();

            if(i>0)
                return "Success";
            else
                return "Fail";

        } catch(Exception e){
            e.printStackTrace();
        }

        return "Fail";
    }

    public static void main(String args[]) {

        UserBean bean=new UserBean();

        bean.setUserID("BB1005");
        bean.setPassword("BB1005");
        bean.setName("Kiran");
        bean.setIncorrectAttempts(0);
        bean.setLockStatus(0);
        bean.setUserType("Employee");

        Scenario8 obj=new Scenario8();

        System.out.println(obj.addUser_2(bean));
    }
}