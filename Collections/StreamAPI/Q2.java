import java.util.*;
import java.util.stream.*;

class Employee {
    int empNo;
    String name;
    int age;
    String location;

    Employee(int empNo, String name, int age, String location) {
        this.empNo = empNo;
        this.name = name;
        this.age = age;
        this.location = location;
    }

    public String toString() {
        return empNo + " " + name + " " + age + " " + location;
    }
}

public class Q2 {
    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee(101, "Ram", 25, "Pune"));
        list.add(new Employee(102, "Hari", 28, "Hyderabad"));
        list.add(new Employee(103, "Ravi", 30, "Pune"));
        list.add(new Employee(104, "Sita", 24, "Chennai"));
        list.add(new Employee(105, "Gopi", 27, "Pune"));

        ArrayList<Employee> puneEmployees = list.stream()
                .filter(e -> e.location.equalsIgnoreCase("Pune"))
                .collect(Collectors.toCollection(ArrayList::new));

        puneEmployees.forEach(System.out::println);
    }
}