public class Q1A {
    public static void main(String[] args) {
        int a=Integer.parseInt(args[0]);
        if (a>0) {
            System.out.println("The number is positive");
        } else if (a<0) {
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is zero");
        }
    }
}