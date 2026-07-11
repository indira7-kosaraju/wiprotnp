package ExceptionHandling;

import java.util.Scanner;

class InvalidMarksException extends Exception {
    InvalidMarksException(String msg) {
        super(msg);
    }
}

public class Q3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            for (int i = 1; i <= 2; i++) {

                System.out.println("Enter Student Name:");
                String name = sc.nextLine();

                int total = 0;

                System.out.println("Enter marks in 3 subjects:");

                for (int j = 1; j <= 3; j++) {

                    int mark = Integer.parseInt(sc.nextLine());

                    if (mark < 0 || mark > 100) {
                        throw new InvalidMarksException(
                                "Marks should be between 0 and 100");
                    }

                    total += mark;
                }

                double avg = total / 3.0;

                System.out.println("Name : " + name);
                System.out.println("Average : " + avg);
            }

        } catch (NumberFormatException e) {
            System.out.println("java.lang.NumberFormatException");
        } catch (InvalidMarksException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}