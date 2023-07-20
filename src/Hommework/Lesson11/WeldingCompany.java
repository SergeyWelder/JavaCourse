package Hommework.Lesson11;

public class WeldingCompany {
    String name;
    String area;
    String exc;
    int people;

    public WeldingCompany(String name, String area, String exc, int people) {
        this.name = name;
        this.area = area;
        this.exc = exc;
        this.people = people;
    }
}

class WeldingCompanyTest {
    void excChange(WeldingCompany wc1, String level) {
        wc1.exc = level;
    }

    void nameChange(WeldingCompany wc1, WeldingCompany wc2) {
        String name = wc1.name;
        wc1.name = wc2.name;
        wc2.name = name;
    }

    public static void main(String[] args) {
        WeldingCompanyTest wct1 = new WeldingCompanyTest();
        WeldingCompany wc1 = new WeldingCompany("Weldman", "Training", "3", 5);
        WeldingCompany wc2 = new WeldingCompany("Marketex", "Shippbuilding", "3", 500);
        wct1.excChange(wc1, "2");
        wct1.nameChange(wc1, wc2);
        System.out.println(wc1.name);
        System.out.println(wc1.exc);


    }
}