package Hommework.Lesson8;

public class Hommework {
    static final double pi = 3.14;

    public double circleSquare(int radius) {
        double result = pi * radius * radius;
        System.out.println(result);

        return result;

    }

    public static double circle(int radius) {
        double circle = 2 * pi * radius;
        System.out.println(circle);

        return circle;
    }

    public void info(int radius) {
        System.out.println("radius " + radius);
        System.out.println("Ploshad" + circleSquare(radius));
        System.out.println("Dlina" + circle(radius));

    }
}

class HommeworkTest {
    public static void main(String[] args) {
        Hommework h = new Hommework();
        h.circleSquare(5);
        h.info(8);
        Hommework.circle(20);
    }
}

