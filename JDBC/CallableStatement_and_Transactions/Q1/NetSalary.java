package Q1;

import java.sql.*;

public class NetSalary {

    public static void main(String[] args) {

        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@//localhost:1521/XEPDB1",
                    "hr",
                    "hr");

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(
                    "SELECT EMPNO, ENAME FROM EMP1");

            while (rs.next()) {

                int empno = rs.getInt("EMPNO");
                String ename = rs.getString("ENAME");

                CallableStatement cs = con.prepareCall(
                        "{call NetSalaryProc(?,?)}");

                cs.setInt(1, empno);
                cs.registerOutParameter(2, Types.DOUBLE);

                cs.execute();

                double netSalary = cs.getDouble(2);

                System.out.println(
                        empno + " " +
                        ename + " " +
                        netSalary);

                cs.close();
            }

            rs.close();
            st.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}