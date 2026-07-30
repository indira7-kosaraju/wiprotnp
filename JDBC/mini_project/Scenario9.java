package mini_project;

import java.sql.*;
import java.util.*;

public class Scenario9 {

    public ArrayList<UserBean> getUsers(String userType) {

        ArrayList<UserBean> list=new ArrayList<>();

        try {

            Connection con=DBConnection.getConnection();

            PreparedStatement ps=con.prepareStatement(
            "SELECT * FROM USERS WHERE USERTYPE=?");

            ps.setString(1,userType);

            ResultSet rs=ps.executeQuery();

            while(rs.next()) {

                UserBean bean=new UserBean();

                bean.setUserID(rs.getString(1));
                bean.setPassword(rs.getString(2));
                bean.setName(rs.getString(3));
                bean.setIncorrectAttempts(rs.getInt(4));
                bean.setLockStatus(rs.getInt(5));
                bean.setUserType(rs.getString(6));

                list.add(bean);
            }

        } catch(Exception e){
            e.printStackTrace();
        }

        return list;
    }

    public static void main(String args[]) {

        Scenario9 obj=new Scenario9();

        ArrayList<UserBean> list=obj.getUsers("Employee");

        for(UserBean b:list) {

            System.out.println(
                    b.getUserID()+" "+
                    b.getName()+" "+
                    b.getUserType());
        }
    }
}