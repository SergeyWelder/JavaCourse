package Hommework.Lesson4;

public class SummaChisel {
    void sum(int a, int b, int c, int d) {
        int result = a + b + c + d;
        System.out.println(result);
    }

    void sum(int a, int b, int c) {
        int result = a + b + c;
        System.out.println(result);
    }

    void sum(int a, int b) {
        int result = a + b;
        System.out.println(result);
    }

    void sum(int a) {
        int result = a;
        System.out.println(result);

    }

    void sum() {
        System.out.println("Nothing");
    }

}

class SummaChiselTest {
    public static void main(String[] args) {
        SummaChisel s1 = new SummaChisel();
        s1.sum();
        s1.sum(5);
        s1.sum(82, 5);
        s1.sum(5, 8, 2);
        s1.sum(5, 6, 8, 7);
    }
}