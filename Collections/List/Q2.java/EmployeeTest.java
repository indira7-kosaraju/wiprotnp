public class EmployeeTest {

    public static void main(String[] args) {

        EmployeeDB db = new EmployeeDB();

        Employee e1 =new Employee(101, "Rahul","rahul@gmail.com", "Male", 50000);

        Employee e2 =new Employee(102, "Priya", "priya@gmail.com", "Female", 60000);

        db.addEmployee(e1);
        db.addEmployee(e2);

        e1.getEmployeeDetails();

        System.out.println(db.showPaySlip(101));

        db.deleteEmployee(102);
    }
}