package Q1;

public interface Vehicle {

    default void message() {
        System.out.println("Inside Vehicle");
    }
}
