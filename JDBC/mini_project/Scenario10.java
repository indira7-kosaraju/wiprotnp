package mini_project;

import java.sql.*;
import java.util.*;

public class Scenario10 {

    public ArrayList<UserBean> storeAllRecords() {

        ArrayList<UserBean> list = new ArrayList<>();

        try {

            Connection con = DBConnection.getConnection();

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("SELECT * FROM USERS");

            while (rs.next()) {

                UserBean bean = new UserBean();

                bean.setUserID(rs.getString(1));
                bean.setPassword(rs.getString(2));
                bean.setName(rs.getString(3));
                bean.setIncorrectAttempts(rs.getInt(4));
                bean.setLockStatus(rs.getInt(5));
                bean.setUserType(rs.getString(6));

                list.add(bean);
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    public static void main(String[] args) {

        Scenario10 obj = new Scenario10();

        ArrayList<UserBean> list = obj.storeAllRecords();

        for(UserBean b : list) {

            System.out.println(
                    b.getUserID()+" "+
                    b.getPassword()+" "+
                    b.getName()+" "+
                    b.getIncorrectAttempts()+" "+
                    b.getLockStatus()+" "+
                    b.getUserType());
        }
    }
}