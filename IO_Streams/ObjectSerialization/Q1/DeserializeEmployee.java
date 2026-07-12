import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializeEmployee {

    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("data");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Employee emp = (Employee) ois.readObject();

            ois.close();
            fis.close();

            System.out.println("Name : " + emp.getName());
            System.out.println("DOB : " + emp.getDateOfBirth());
            System.out.println("Department : " + emp.getDepartment());
            System.out.println("Designation : " + emp.getDesignation());
            System.out.println("Salary : " + emp.getSalary());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}