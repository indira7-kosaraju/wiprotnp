import java.util.*;
import java.util.stream.*;

public class Q1 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(
                Arrays.asList(-2, 5, -8, 10, -12, 7, -4, 9));

        ArrayList<Integer> result = list.stream()
                .filter(n -> n < 0 && n % 2 == 0)
                .collect(Collectors.toCollection(ArrayList::new));

        result.forEach(System.out::println);
    }
}