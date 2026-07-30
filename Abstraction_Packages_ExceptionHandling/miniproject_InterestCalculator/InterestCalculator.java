package miniproject_InterestCalculator;

import java.util.Scanner;

public class InterestCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\nMAIN MENU");
            System.out.println("1. Interest Calculator - SB");
            System.out.println("2. Interest Calculator - FD");
            System.out.println("3. Interest Calculator - RD");
            System.out.println("4. Exit");

            System.out.print("Enter your option (1..4): ");
            int choice = sc.nextInt();

            try {

                switch (choice) {

                    case 1:
                        System.out.print("Enter average amount: ");
                        double sbAmount = sc.nextDouble();

                        if (sbAmount < 0)
                            throw new InvalidInputException("Invalid amount.");

                        System.out.print("Enter account type (Normal/NRI): ");
                        String type = sc.next();

                        SBAccount sb = new SBAccount(sbAmount, type);

                        System.out.println("Interest gained: Rs. "
                                + sb.calculateInterest());
                        break;

                    case 2:

                        System.out.print("Enter FD amount: ");
                        double fdAmount = sc.nextDouble();

                        System.out.print("Enter number of days: ");
                        int days = sc.nextInt();

                        System.out.print("Enter age: ");
                        int age = sc.nextInt();

                        if (fdAmount < 0 || days < 0 || age < 0)
                            throw new InvalidInputException(
                                    "Invalid Number of days. Please enter non-negative values.");

                        FDAccount fd = new FDAccount(fdAmount, days, age);

                        System.out.println("Interest gained is: Rs. "
                                + fd.calculateInterest());

                        break;

                    case 3:

                        System.out.print("Enter monthly amount: ");
                        double rdAmount = sc.nextDouble();

                        System.out.print("Enter months (6/9/12/15/18/21): ");
                        int months = sc.nextInt();

                        System.out.print("Enter age: ");
                        int rdAge = sc.nextInt();

                        if (rdAmount < 0 || months < 0 || rdAge < 0)
                            throw new InvalidInputException(
                                    "Invalid input. Please enter non-negative values.");

                        RDAccount rd = new RDAccount(rdAmount, months, rdAge);

                        System.out.println("Interest gained is: Rs. "
                                + rd.calculateInterest());

                        break;

                    case 4:
                        System.out.println("Thank You");
                        System.exit(0);

                    default:
                        System.out.println("Invalid Choice");
                }

            } catch (InvalidInputException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}