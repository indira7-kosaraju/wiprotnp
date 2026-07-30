package demo;
import test.Foundation;

public class AccessTest {
    public static void main(String[] args) {

        Foundation f = new Foundation();

        // System.out.println(f.var1); // Error: private
        // System.out.println(f.var2); // Error: default
        // System.out.println(f.var3); // Error: protected

        System.out.println("var4 = " + f.var4); // Accessible
    }
}