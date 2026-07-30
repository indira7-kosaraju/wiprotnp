package mini_project;

import java.sql.*;

public class Scenario4 {

    public int getLockStatus() {

        try {

            Connection con = DBConnection.getConnection();

            PreparedStatement ps =
                    con.prepareStatement(
                    "SELECT COUNT(*) FROM Users WHERE LockStatus=0");

            ResultSet rs = ps.executeQuery();

            if(rs.next())
                return rs.getInt(1);

        } catch(Exception e) {
            e.printStackTrace();
        }

        return 0;
    }

    public static void main(String args[]) {

        Scenario4 obj = new Scenario4();

        System.out.println(obj.getLockStatus());
    }
}