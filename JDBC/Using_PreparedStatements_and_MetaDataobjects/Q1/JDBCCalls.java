package Q1;

public class JDBCCalls {

    public static void main(String[] args) {

        DAOClass dao = new DAOClass();

        int option = Integer.parseInt(args[0]);

        if (option == 1) {

            int rollno = Integer.parseInt(args[1]);
            String name = args[2];
            String grade = args[3];
            String dob = args[4];
            int fee = Integer.parseInt(args[5]);

            dao.insert(rollno, name, grade, dob, fee);
        }
    }
}