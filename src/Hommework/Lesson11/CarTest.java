package Hommework.Lesson11;

public class CarTest {
    public void doorChange(Car c, int doors) {
        c.doors = doors;
    }
    void colorChange(Car car1, Car car2) {
        String color = car1.color;
        car1.color = car2.color;
        car2.color = color;

    }

    public static void main(String[] args) {
        CarTest ct = new CarTest();
        Car car1 = new Car("Red", "v6", 5);
        Car car2 = new Car("Yellow", "V8", 5);
        System.out.println(car1.doors);
        ct.doorChange(car1, 7);
        ct.colorChange(car1, car2);
        System.out.println(car1.doors);
        System.out.println(car1.color);
    }
}


