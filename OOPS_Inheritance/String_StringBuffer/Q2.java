import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc.nextLine();

        if(Character.toLowerCase(a.charAt(a.length()-1))
                == Character.toLowerCase(b.charAt(0))) {
            b = b.substring(1);
        }

        System.out.println((a + b).toLowerCase());
    }
}