package Hommework.Lesson13;

public class Month {
    int month; //2015y

    public static void dayQuantity(int month) {

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 days");
                break;
            case 2:
                System.out.println("28 days");
                break;
            default:
                System.out.println("incorrect data");
        }

    }

    public static void main(String[] args) {
        dayQuantity(3);
        dayQuantity(2);
        dayQuantity(4);
        dayQuantity(-5);
    }
}
