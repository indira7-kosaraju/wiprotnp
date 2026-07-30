import java.time.*;
import java.time.temporal.ChronoUnit;

public class Q3 {
    public static void main(String[] args) {
        LocalDate joiningDate = LocalDate.of(2020, 1, 1); // Change date

        LocalDate today = LocalDate.now();

        Period experience = Period.between(joiningDate, today);

        System.out.println("Experience: "
                + experience.getYears() + " Years, "
                + experience.getMonths() + " Months, "
                + experience.getDays() + " Days");
    }
}