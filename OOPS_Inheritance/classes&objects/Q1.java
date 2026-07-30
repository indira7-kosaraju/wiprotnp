class Box {
    double width, height, depth;

    // Parameterized Constructor
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    double volume() {
        return width * height * depth;
    }
}

public class Q1 {
    public static void main(String[] args) {
        Box b = new Box(10, 5, 2);

        System.out.println("Volume = " + b.volume());
    }
}