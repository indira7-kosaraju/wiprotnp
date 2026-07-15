import java.util.ArrayList;
import java.util.Collections;

public class Q2 {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("Java");
        al.add("Python");
        al.add("C");
        al.add("C++");
        al.add("HTML");
        al.add("CSS");
        al.add("JavaScript");
        al.add("SQL");
        al.add("React");
        al.add("Node");

        Collections.reverse(al);

        al.forEach(s -> System.out.println(s));
    }
}