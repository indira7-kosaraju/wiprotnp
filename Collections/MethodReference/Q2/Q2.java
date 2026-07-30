public class Q2 {
    public static void main(String[] args) {

        DigitInterface d = DigitCount::digitCount;

        System.out.println("Digits = " + d.count(12345));
    }
}