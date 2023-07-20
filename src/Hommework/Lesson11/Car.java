package Hommework.Lesson11;

public class Car {
    String color;
    String engine;
    static int doors = 4;

    Car(String color, String engine, int doors) {
        this.color = color;
        this.engine = engine;
        this.doors = doors;
    }

    public static int doorChange(int b) {
        doors = doors + b;
        return doors;
    }

}

class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car("Red", "v6", 4);
        System.out.println(Car.doors);
        System.out.println(Car.doorChange(3));
        System.out.println(Car.doors);


    }

}