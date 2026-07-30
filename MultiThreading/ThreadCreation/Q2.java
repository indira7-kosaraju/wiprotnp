import java.util.Random;
class ColourRunnable implements Runnable {
    String[] colours = {
            "white",
            "blue",
            "black",
            "green",
            "red",
            "yellow"
    };

    public void run() {

        Random random = new Random();

        while (true) {

            int index = random.nextInt(colours.length);

            System.out.println(colours[index]);

            if (colours[index].equals("red")) {
                System.out.println("Red selected. Stopping...");
                break;
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Q2 {
    public static void main(String[] args) {

        Thread t = new Thread(new ColourRunnable());

        t.start();
    }
}