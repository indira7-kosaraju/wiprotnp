package mini_project;

import java.sql.*;
import java.util.*;

public class Scenario11 {

    public String[] getNames() {

        ArrayList<String> list = new ArrayList<>();

        try {

            Connection con = DBConnection.getConnection();

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(
                    "SELECT NAME FROM USERS");

            while(rs.next()) {

                list.add(rs.getString(1));
            }

            con.close();

        } catch(Exception e) {
            e.printStackTrace();
        }

        return list.toArray(new String[0]);
    }

    public static void main(String[] args) {

        Scenario11 obj = new Scenario11();

        String names[] = obj.getNames();

        for(String s : names) {

            System.out.println(s);
        }
    }
}