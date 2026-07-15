public class Prime {

    public Prime(int n) {
        boolean prime = n > 1;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }

        if (prime)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }
}