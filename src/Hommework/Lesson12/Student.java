package Hommework.Lesson12;

public class Student {
    String name;
    int course;
    double grade;

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
