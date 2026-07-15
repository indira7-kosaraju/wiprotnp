import java.util.*;
import java.util.function.Supplier;

public class Q8 {
    public static void main(String[] args) {

        Supplier<ArrayList<Integer>> s = () -> {

            ArrayList<Integer> primes = new ArrayList<>();
            int num = 2;

            while (primes.size() < 10) {
                boolean prime = true;

                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        prime = false;
                        break;
                    }
                }

                if (prime)
                    primes.add(num);

                num++;
            }

            return primes;
        };

        System.out.println(s.get());
    }
}