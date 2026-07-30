import java.util.*;
import java.util.function.Predicate;

class Employee1 {
    private int id;
    private String name;
    private double salary;

    Employee1(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

public class Q4 {
    public static void main(String[] args) {

        ArrayList<Employee1> list = new ArrayList<>();

        list.add(new Employee1(101, "Ram", 8000));
        list.add(new Employee1(102, "Hari", 12000));
        list.add(new Employee1(103, "Ravi", 9000));
        list.add(new Employee1(104, "Sita", 15000));
        list.add(new Employee1(105, "Gopi", 7000));

        Predicate<Employee1> p = e -> e.getSalary() < 10000;

        list.stream()
            .filter(p)
            .forEach(e -> System.out.println(e.getName()));
    }
}