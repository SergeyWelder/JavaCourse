package Hommework;

public class BankAccount {
    int id;
    String name;
    double balance;
    double popolnenieScjota (double plus){
       double result= balance+=plus;

        return result;
    }
    double snjatieSoScjota (double minus){
        double result= balance-=minus;

        return result;
    }
}

class BankAccountTest {
    public static void main(String[] args) {
        BankAccount MyAccount = new BankAccount();
        BankAccount YourAccount = new BankAccount();
        BankAccount HisAccount = new BankAccount();
        MyAccount.id = 1;
        MyAccount.name = "Sergey";
        MyAccount.balance = 100.00;

        YourAccount.id = 2;
        YourAccount.name = "Valera";
        YourAccount.balance = 90.0;

        HisAccount.id = 1;
        HisAccount.name = "Sergey";
        HisAccount.balance = 80.00;
        System.out.println("Bank accout balance: "+MyAccount.balance+" Balance after adding: "+MyAccount.popolnenieScjota(20.0));
        System.out.println(YourAccount.popolnenieScjota(10.0));
        System.out.println(HisAccount.popolnenieScjota(25.5));

        System.out.println(MyAccount.snjatieSoScjota(10.0));
        System.out.println(YourAccount.snjatieSoScjota(10.0));
        System.out.println(HisAccount.snjatieSoScjota(25.5));




        }


    }

