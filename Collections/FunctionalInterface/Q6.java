import java.util.*;
import java.util.function.Consumer;

public class Q6 {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>(
                Arrays.asList("java","python","wipro","stream","lambda",
                              "apple","orange","hello","world","code"));

        Consumer<String> c =
                s -> System.out.println(new StringBuilder(s).reverse());

        words.forEach(c);
    }
}