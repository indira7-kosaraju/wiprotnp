package miniproject_InterestCalculator;

class FDAccount extends Account {

    int noOfDays;
    int ageOfACHolder;

    public FDAccount(double amount, int noOfDays, int ageOfACHolder) {
        this.amount = amount;
        this.noOfDays = noOfDays;
        this.ageOfACHolder = ageOfACHolder;
    }

    @Override
    double calculateInterest() {

        if (amount < 10000000) {

            if (noOfDays >= 7 && noOfDays <= 14)
                interestRate = (ageOfACHolder >= 60) ? 5.0 : 4.5;

            else if (noOfDays >= 15 && noOfDays <= 29)
                interestRate = (ageOfACHolder >= 60) ? 5.25 : 4.75;

            else if (noOfDays >= 30 && noOfDays <= 45)
                interestRate = (ageOfACHolder >= 60) ? 6.0 : 5.5;

            else if (noOfDays >= 46 && noOfDays <= 60)
                interestRate = (ageOfACHolder >= 60) ? 7.5 : 7.0;

            else if (noOfDays >= 61 && noOfDays <= 184)
                interestRate = (ageOfACHolder >= 60) ? 8.0 : 7.5;

            else if (noOfDays >= 185 && noOfDays <= 365)
                interestRate = (ageOfACHolder >= 60) ? 8.5 : 8.0;

        } else {

            if (noOfDays >= 7 && noOfDays <= 14)
                interestRate = 6.5;

            else if (noOfDays >= 15 && noOfDays <= 29)
                interestRate = 6.75;

            else if (noOfDays >= 30 && noOfDays <= 45)
                interestRate = 6.75;

            else if (noOfDays >= 46 && noOfDays <= 60)
                interestRate = 8.0;

            else if (noOfDays >= 61 && noOfDays <= 184)
                interestRate = 8.5;

            else if (noOfDays >= 185 && noOfDays <= 365)
                interestRate = 10.0;
        }

        return amount * interestRate / 100;
    }
}