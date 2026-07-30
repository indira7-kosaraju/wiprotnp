import java.util.Optional;

public class Q1 {
    public static void main(String[] args) {

        String names[] = new String[5];

        Optional<String> op = Optional.ofNullable(names[0]);

        if(op.isPresent())
            System.out.println(op.get().length());
        else
            System.out.println("Value is null");
    }
}