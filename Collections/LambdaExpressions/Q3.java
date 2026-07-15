import java.util.ArrayList;

public class Q3 {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("Java");
        al.add("Python");
        al.add("C");
        al.add("CPlus");
        al.add("HTML");
        al.add("CSS");
        al.add("JavaScript");
        al.add("SQL");
        al.add("React");
        al.add("Node");

        al.forEach(s -> {
            if (s.length() % 2 != 0)
                System.out.println(s);
        });
    }
}