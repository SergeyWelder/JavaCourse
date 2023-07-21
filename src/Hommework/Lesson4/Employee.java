package Hommework.Lesson4;

public class Employee {
    int salary;
    int id;
    String surname;
    int age;
    String department;


    Employee(int id1, String surname1, int salary1, int age, String department1) {
        id1 = id;
        surname = surname1;
        salary = salary1;
        age = age;
        department = department1;
    }

    int salaryGrowth() {
        int result = salary * 2;

        return result;

    }
}

class EmployeeTest {
    public static void main(String[] args) {


        Employee emp1 = new Employee(1, "Zukov", 500, 25, "Logistik");
        Employee emp2 = new Employee(2, "Popov", 1000, 37, "IT");
        System.out.println("Rabotnik " + emp1.surname + " zp: " + emp1.salary + " Zp posle uveli4: " + emp1.salaryGrowth());
        System.out.println("Rabotnik " + emp2.surname + " zp: " + emp2.salary + " Zp posle uveli4: " + emp2.salaryGrowth());


    }
}
