package Hommework.Lesson12;

public class Student {
    String name;
    int course;
    double grade;

    Student() {
    }

    Student(String name, int course, double grade) {
        this.name = name;
        this.course = course;
        this.grade = grade;
    }

    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 5, 4.8);
        Student st2 = new Student("Zora", 4, 4.9);
    }
}

class StudentTest {
    void sravnenie(Student st1, Student st2) {
        if (st1.grade == st2.grade & st1.course == st2.course & st1.name.equals(st2.name)) {
            System.out.println("Studentq rovnq");
        } else {
            System.out.println("Studentq ne rovnq");
        }
    }

    void sravnenie2(Student st1, Student st2) {
        if (st1.grade == st2.grade) {


            if (st1.course == st2.course) {


                if (st1.name.equals(st2.name)) {
                    System.out.println("Оценки, курсы и имена студентов одинаковые");

                } else {
                    System.out.println("Оценки и курс студентов одинаковые а имена разные");
                }
            } else {
                System.out.println("Имена и оценки  одинаковые, а курсы разные");
            }
        } else {
            System.out.println("Оценки студентов отличаются");

        }

    }


    public static void main(String[] args) {
        StudentTest stt = new StudentTest();
        Student st = new Student("Ivan", 3, 5.5);
        Student st2 = new Student("Ivan", 3, 5.0);
        stt.sravnenie(st, st2);
        stt.sravnenie2(st, st2);

    }

}
