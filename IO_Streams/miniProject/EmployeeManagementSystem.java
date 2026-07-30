import java.io.*;
import java.util.*;

public class EmployeeManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Main Menu");
            System.out.println("1. Add an Employee");
            System.out.println("2. Display All");
            System.out.println("3. Exit");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Employee ID :");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Employee Name :");
                    String name = sc.nextLine();

                    System.out.print("Enter Employee Age :");
                    int age = sc.nextInt();

                    System.out.print("Enter Employee Salary :");
                    double salary = sc.nextDouble();

                    Employee emp = new Employee(id, name, age, salary);

                    try {
                        FileWriter fw = new FileWriter("employee.txt", true);
                        fw.write(emp.toString() + "\n");
                        fw.close();
                    } catch (IOException e) {
                        System.out.println("Error writing file");
                    }
                    break;

                case 2:
                    System.out.println("-----Report-----");

                    try {
                        BufferedReader br =
                                new BufferedReader(new FileReader("employee.txt"));

                        String line;

                        while ((line = br.readLine()) != null) {
                            System.out.println(line);
                        }

                        br.close();

                    } catch (IOException e) {
                        System.out.println("No employee records found.");
                    }

                    System.out.println("-----End of Report-----");
                    break;

                case 3:
                    System.out.println("Exiting the System");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 3);

        sc.close();
    }
}