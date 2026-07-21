public class Tortoise extends Thread {

    @Override
    public void run() {

        for (int i = 1; i <= 100 && !Hare.raceOver; i++) {

            System.out.println("Tortoise : " + i + " meters");

            if (i == 100 && !Hare.raceOver) {
                Hare.raceOver = true;
                System.out.println("\nTortoise wins the race!");
            }
        }
    }
}