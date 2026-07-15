import java.util.*;
import java.util.function.Predicate;

public class Q3 {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>(
                Arrays.asList("madam","java","level","hello","radar",
                              "world","malayalam","wipro","noon","code"));

        Predicate<String> p =
                s -> s.equalsIgnoreCase(new StringBuilder(s).reverse().toString());

        words.stream()
             .filter(p)
             .forEach(System.out::println);
    }
}