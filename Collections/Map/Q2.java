import java.util.*;

public class Q2 {
    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();

        map.put("101", "Java");
        map.put("102", "Python");
        map.put("103", "C++");

        System.out.println("Key 102 exists: " + map.containsKey("102"));
        System.out.println("Value Java exists: " + map.containsValue("Java"));

        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<String, String> e = it.next();
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }
}