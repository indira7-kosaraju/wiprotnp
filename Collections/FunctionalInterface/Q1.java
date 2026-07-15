import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

class Employee {
    int id;
    String name;
    String location;
    double salary;

    Employee(int id, String name, String location, double salary) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.salary = salary;
    }
}

public class Q1 {
    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee(101, "Ram", "Pune", 25000));
        list.add(new Employee(102, "Hari", "Hyderabad", 30000));
        list.add(new Employee(103, "Ravi", "Chennai", 28000));
        list.add(new Employee(104, "Sita", "Bangalore", 35000));
        list.add(new Employee(105, "Gopi", "Mumbai", 27000));

        Function<Employee, String> f = e -> e.location;

        ArrayList<String> locations = list.stream()
                .map(f)
                .collect(Collectors.toCollection(ArrayList::new));

        locations.forEach(System.out::println);
    }
}