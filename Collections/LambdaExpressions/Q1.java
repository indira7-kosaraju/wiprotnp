import java.util.ArrayList;

public class Q1 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 1; i <= 25; i++) {
            al.add(i);
        }

        al.forEach(n -> {
            boolean prime = n > 1;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime)
                System.out.print(n + " ");
        });
    }
}