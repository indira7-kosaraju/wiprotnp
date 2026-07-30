import java.util.*;

class Student {
    int rollNo;
    String name;
    int mark;

    Student(int rollNo, String name, int mark) {
        this.rollNo = rollNo;
        this.name = name;
        this.mark = mark;
    }
}

public class Q3 {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(1, "A", 60));
        list.add(new Student(2, "B", 45));
        list.add(new Student(3, "C", 70));
        list.add(new Student(4, "D", 55));
        list.add(new Student(5, "E", 40));

        long count = list.stream()
                .filter(s -> s.mark >= 50)
                .count();

        System.out.println("Students Passed = " + count);
    }
}