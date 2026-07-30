import java.time.LocalTime;

public class Q6 {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        LocalTime beforeTime = now.minusHours(5).minusMinutes(30);

        System.out.println("Current Time: " + now);
        System.out.println("Time before 5 hours 30 minutes: " + beforeTime);
    }
}