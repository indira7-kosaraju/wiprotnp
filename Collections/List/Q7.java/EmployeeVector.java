import java.util.*;
public class EmployeeVector {

    public static void main(String[] args) {

        Vector<Employee> employees = new Vector<>();

        employees.add(new Employee(101, "Rahul"));
        employees.add(new Employee(102, "Priya"));
        employees.add(new Employee(103, "Kiran"));

        System.out.println("Using Iterator:");

        Iterator<Employee> itr = employees.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("\nUsing Enumeration:");

        Enumeration<Employee> en = employees.elements();

        while (en.hasMoreElements()) {
            System.out.println(en.nextElement());
        }
    }
}