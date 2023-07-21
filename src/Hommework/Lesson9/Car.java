package Hommework.Lesson9;

public class Car {
    String color;
    String engine;
    static int count;

    Car(String color, String engine) {
        count++;
        this.color = color;
        this.engine = engine;

    }

    public void showColor() {
        System.out.println("Cvet mawinq" + color);
    }

    public void changeColor(String color3) {
        System.out.println("Cvet mawinq izmenilsja");
        int cena = 5000;
        color = color3;
        cena += 1000;
    }
}
class Car2{
    int a =11;

}
