import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc.nextLine();

        String result = "";

        int min = Math.min(a.length(), b.length());

        for(int i = 0; i < min; i++) {
            result += a.charAt(i);
            result += b.charAt(i);
        }

        result += a.substring(min);
        result += b.substring(min);

        System.out.println(result);
    }
}