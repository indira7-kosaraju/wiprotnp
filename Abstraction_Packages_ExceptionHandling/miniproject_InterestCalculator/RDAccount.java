package miniproject_InterestCalculator;

class RDAccount extends Account {

    int noOfMonths;
    int age;

    public RDAccount(double amount, int noOfMonths, int age) {
        this.amount = amount;
        this.noOfMonths = noOfMonths;
        this.age = age;
    }

    @Override
    double calculateInterest() {

        if (noOfMonths == 6)
            interestRate = (age >= 60) ? 8.0 : 7.5;

        else if (noOfMonths == 9)
            interestRate = (age >= 60) ? 8.25 : 7.75;

        else if (noOfMonths == 12)
            interestRate = (age >= 60) ? 8.5 : 8.0;

        else if (noOfMonths == 15)
            interestRate = (age >= 60) ? 8.75 : 8.25;

        else if (noOfMonths == 18)
            interestRate = (age >= 60) ? 9.0 : 8.5;

        else if (noOfMonths == 21)
            interestRate = (age >= 60) ? 9.25 : 8.75;

        return amount * interestRate / 100;
    }
}