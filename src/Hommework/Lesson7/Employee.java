package Hommework.Lesson7;

import org.w3c.dom.ls.LSOutput;

public class Employee {
    private double salary;
    int id;
    public String surname;
    int age;
    String department;

    private Employee(double salary1) {
        salary1 = salary;
    }

    public Employee(String surname1) {
        surname1 = surname;
    }

    Employee(int id1) {
        id1 = id1;
    }


    public void showSalary() {
        System.out.println(salary);
    }

    public void showSurname() {
        System.out.println(surname);
    }

    public void showId() {
        System.out.println(id);
    }
}

class Employee2 {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1);
        Employee emp2 = new Employee("Ivanov");
        System.out.println(emp1.id);

    }



}
