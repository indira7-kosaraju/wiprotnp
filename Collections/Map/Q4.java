import java.util.*;

public class Q4 {
    public static void main(String[] args) {

        HashMap<String, Integer> contacts = new HashMap<>();

        contacts.put("Ravi", 12345);
        contacts.put("Kiran", 67890);
        contacts.put("Teja", 11111);

        System.out.println("Key Ravi exists: " +
                contacts.containsKey("Ravi"));

        System.out.println("Value 67890 exists: " +
                contacts.containsValue(67890));

        Iterator<Map.Entry<String, Integer>> it =
                contacts.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<String, Integer> e = it.next();
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }
}