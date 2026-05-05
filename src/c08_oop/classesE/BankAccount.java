package c08_oop.classesE;

public class BankAccount {

    // Atributos
    double balance;

    // Constructor
    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Métodos
    public double deposit(double amount) {
        balance += amount;
        System.out.println(String.format("Usted depositó $%.2f, el nuevo balance en su cuenta es de $%.2f",amount, balance));
        return balance;
    }
}
