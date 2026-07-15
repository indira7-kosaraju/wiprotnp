import java.util.*;
import java.util.function.Predicate;

public class Q5 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(
                Arrays.asList(0,1,2,4,5,9,10,16,25,30));

        Predicate<Integer> p = n -> {
            int root = (int)Math.sqrt(n);
            return root * root == n;
        };

        list.stream()
            .filter(p)
            .forEach(System.out::println);
    }
}