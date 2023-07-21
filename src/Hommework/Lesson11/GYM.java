package Hommework.Lesson11;

public class GYM {
    String name;
    String town;
    int square;
    double price;

    public GYM(String name, String town, int square, double price) {
        this.name = name;
        this.town = town;
        this.square = square;
        this.price = price;
    }

}

class GYMTest {
    void priceChange(GYM g, double price) {
        g.price = price;
    }

    void townChange(GYM g1, GYM g2) {
        String town = g1.town;
        g1.town = g2.town;
        g2.town = town;
    }

    public static void main(String[] args) {
        GYMTest gt = new GYMTest();
        GYM g1 = new GYM("Reval Sport", "Tallinn", 500, 45.0);
        GYM g2 = new GYM("Evail", "Sillamae", 120, 50.0);
        gt.priceChange(g1, 60.0);
        gt.townChange(g2, g1);
        System.out.println(g1.price);
        System.out.println(g2.town);
    }
}
