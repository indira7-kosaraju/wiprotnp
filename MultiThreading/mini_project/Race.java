public class Race {

    public static void main(String[] args) {

        Hare hare = new Hare();
        Tortoise tortoise = new Tortoise();

        hare.setPriority(Thread.MAX_PRIORITY);
        tortoise.setPriority(Thread.MIN_PRIORITY);

        hare.start();
        tortoise.start();
    }
}