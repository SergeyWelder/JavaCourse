package Hommework.Lesson8;

public class StaticFinal {
    static int umnazenie(int a, int b, int c) {
        int result = a * b * c;
        return result;
    }

    static void delenie(int a, int b) {
        int result = a / b;
        int result2 = a % b;
        System.out.println(result +" "+ result2);
    }
}
class Result{
    public static void main(String[] args) {
        StaticFinal.umnazenie(5,5,5);
        StaticFinal.delenie(80,3);
    }
}