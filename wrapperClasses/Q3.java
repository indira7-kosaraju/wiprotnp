import java.util.Scanner;

public class Q3{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String binary = Integer.toBinaryString(n);

        String result = String.format("%8s", binary).replace(' ', '0');

        System.out.println(result);

        sc.close();
    }
}