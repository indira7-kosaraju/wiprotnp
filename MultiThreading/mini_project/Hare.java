public class Hare extends Thread {

    public static volatile boolean raceOver = false;

    @Override
    public void run() {

        for (int i = 1; i <= 100 && !raceOver; i++) {

            System.out.println("Hare : " + i + " meters");

            if (i == 60) {
                try {
                    System.out.println("Hare is sleeping...");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            if (i == 100 && !raceOver) {
                raceOver = true;
                System.out.println("\nHare wins the race!");
            }
        }
    }
}