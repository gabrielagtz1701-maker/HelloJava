package c08_oop.InheritanceE;

public class Account {

    protected double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Depósito realizado. Nuevo saldo: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Retiro realizado. Nuevo saldo: " + balance);
        } else {
            System.out.println("Fondos insuficientes");
        }
    }
}

