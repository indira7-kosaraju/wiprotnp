import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class SerializeEmployee {

    public static void main(String[] args) {

        Employee emp = new Employee(
                "John",
                new Date(),
                "IT",
                "Developer",
                50000.0
        );

        try {
            FileOutputStream fos = new FileOutputStream("data");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(emp);

            oos.close();
            fos.close();

            System.out.println("Employee object serialized successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}