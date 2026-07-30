import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String first = str.substring(0, 2);

        String result = "";

        for(int i = 0; i < str.length(); i++) {
            result += first;
        }

        System.out.println(result);
    }
}