import java.util.*;

public class Q5 {

    TreeMap<String, String> M1 = new TreeMap<>();

    public TreeMap<String, String> saveCountryCapital(String country, String capital) {
        M1.put(country, capital);
        return M1;
    }

    public String getCapital(String country) {
        return M1.get(country);
    }

    public static void main(String[] args) {

        Q5 obj = new Q5();

        obj.saveCountryCapital("India", "Delhi");
        obj.saveCountryCapital("Japan", "Tokyo");

        System.out.println(obj.M1);
        System.out.println(obj.getCapital("India"));
    }
}