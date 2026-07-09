import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int pos = str.indexOf('*');

        String result = str.substring(0, pos-1)
                        + str.substring(pos+2);

        System.out.println(result);
    }
}