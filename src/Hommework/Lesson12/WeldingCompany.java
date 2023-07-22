package Hommework.Lesson12;

public class WeldingCompany {
    String name;
    String area;
    int exc;
    int employees;
    double averegeSalary;

    WeldingCompany(String name, String area, int exc, int employees, double averegeSalary) {
        this.name = name;
        this.area = area;
        this.exc = exc;
        this.employees = employees;
        this.averegeSalary = averegeSalary;
    }

    void compare(WeldingCompany wco1, WeldingCompany wco2) {
        if (wco1.exc == wco2.exc && wco1.area.equals(wco2.area))
            System.out.println("Companies approved");
        else {
            System.out.println("Companies not approved");
        }

    }

    void compare2(WeldingCompany wco1, WeldingCompany wco2) {
        if (wco1.name.equals(wco2.name)) {
            if (wco1.area.equals(wco2.area)) {
                if (wco1.exc == wco2.exc) {
                    if (wco1.employees == wco2.employees) {
                        if (wco1.averegeSalary == wco2.averegeSalary) {
                            System.out.println("Companies are the same");
                        } else {
                            System.out.println("Name,area, EXC level, employees count are the same, but average salary different");
                        }
                    } else {
                        System.out.println("Name, area, EXC level are the same, but employees count different ");
                    }
                } else {
                    System.out.println("Name, area are the same, but EXC leve different");
                }
            } else {
                System.out.println("Names are the same, but area is different");
            }
        } else {
            System.out.println("Companies are different");
        }
    }

}

class WeldingCompanyTest {
    public static void main(String[] args) {
        WeldingCompany wco1 = new WeldingCompany("Weldman", "Shippbuilding", 3, 800, 1500.0);
        WeldingCompany wco2 = new WeldingCompany("Weldman", "Shippbuilding", 3, 800, 1200.0);
        wco1.compare(wco1, wco2);
        wco1.compare2(wco1, wco2);
    }
}
