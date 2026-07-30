package ExceptionHandling;

public class Q2 {

    public static void main(String[] args) {
        try {
            if (args.length != 5) {
                throw new Exception("Please enter 5 integers");
            }

            int sum = 0;

            for (int i = 0; i < 5; i++) {
                sum += Integer.parseInt(args[i]);
            }

            double avg = (double) sum / 5;

            System.out.println("Sum = " + sum);
            System.out.println("Average = " + avg);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}