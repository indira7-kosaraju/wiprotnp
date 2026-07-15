import java.util.*;

public class Q1 {
    HashMap<String, String> M1 = new HashMap<>();

    public HashMap<String, String> saveCountryCapital(String country, String capital) {
        M1.put(country, capital);
        return M1;
    }

    public String getCapital(String country) {
        return M1.get(country);
    }

    public String getCountry(String capital) {
        for (Map.Entry<String, String> e : M1.entrySet()) {
            if (e.getValue().equals(capital))
                return e.getKey();
        }
        return null;
    }

    public HashMap<String, String> createM2() {
        HashMap<String, String> M2 = new HashMap<>();
        for (Map.Entry<String, String> e : M1.entrySet()) {
            M2.put(e.getValue(), e.getKey());
        }
        return M2;
    }

    public ArrayList<String> createArrayList() {
        return new ArrayList<>(M1.keySet());
    }

    public static void main(String[] args) {
        Q1 obj = new Q1();

        obj.saveCountryCapital("India", "Delhi");
        obj.saveCountryCapital("Japan", "Tokyo");

        System.out.println(obj.getCapital("India"));
        System.out.println(obj.getCountry("Tokyo"));
        System.out.println(obj.createM2());
        System.out.println(obj.createArrayList());
    }
}