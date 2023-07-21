package Hommework.Lesson4;

public class Student {
    int id;
    String name;
    String surname;
    String year;
    double mathGrade;
    double economyGrade;
    double languageGrade;

    Student(int id1, String name1, String surname1, String year1, double mathGrade1, double economyGrade1, double languageGrade1) {
        id = id1;
        name = name1;
        surname = surname1;
        year = year1;
        mathGrade = mathGrade1;
        economyGrade = economyGrade1;
        languageGrade = languageGrade1;
    }

    Student(int id, String name, String surname, String year) {
        this(id = id, name = name, surname = surname, year = year, 0.0, 0.0, 0.0);
    }

    Student() {
    }


    double sredOcenka() {

        double result = (mathGrade + economyGrade + languageGrade) / 3;
        return result;
    }
}

class StudentTest {
    public static void main(String[] args) {


        Student st1 = new Student();
        st1.id = 1;
        st1.name = "Egor";
        st1.surname = "Popov";
        st1.year = "2007";
        st1.languageGrade = 4.5;
        st1.economyGrade = 3.2;
        st1.mathGrade = 5.0;
        //double averegGradeSt1 = (st1.economyGrade + st1.mathGrade + st1.languageGrade) / 3;
        System.out.println("Srednjaja ocenka " + st1.name + " " + st1.surname + " ravna: " + st1.sredOcenka());
        Student st2 = new Student();
        st2.id = 2;
        st2.name = "Vlad";
        st2.surname = "Jezov";
        st2.year = "2006";
        st2.languageGrade = 4.3;
        st2.economyGrade = 3.3;
        st2.mathGrade = 4.0;
        //double averegGradeSt2 = (st2.economyGrade + st2.mathGrade + st2.languageGrade) / 3;
        System.out.println("Srednjaja ocenka " + st2.name + " " + st2.surname + " ravna: " + st2.sredOcenka());
        Student st3 = new Student();
        st3.id = 3;
        st3.name = "Sergey";
        st3.surname = "Zukov";
        st3.year = "2005";
        st3.languageGrade = 4.0;
        st3.economyGrade = 3.9;
        st3.mathGrade = 3.0;
        //double averegGradeSt3 = (st3.economyGrade + st3.mathGrade + st3.languageGrade) / 3;
        System.out.println("Srednjaja ocenka " + st3.name + " " + st3.surname + " ravna: " + st3.sredOcenka());

        //Student st4 = new Student("Vasili", "Pupkin");
        Student st5 = new Student(1, "Sasaha", "Kozlov", "1988");
        Student st6 = new Student(2, "Petja", "Morozov", "1965", 5.0, 4.5, 4.3);
        System.out.println(st5.id);
    }
}

