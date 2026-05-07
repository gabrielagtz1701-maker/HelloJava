package c08_oop.AccessModifiersE;

public class BankAccount {

    // Atributo
    private double balance;

    // Constructor
    public BankAccount(double balance) {
        if (balance >= 0) {
            this.balance = balance;
            System.out.println("Cuenta creada con Saldo: $" + balance);
        } else {
            System.out.println("Saldo inicial inválido, se asigna $0.00");
            this.balance = 0;
        }
    }

    // Métodos
    public void desposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Depósito exitoso: $" + amount);
            System.out.println("Saldo actualizado: $" + balance);
        } else {
            System.out.println("Monto inválido");
        }

    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Monto inválido para retiro, debe ser mayor a $0.00");
            return;
        }

        if (amount > balance) {
            System.out.println("Fondos insuficientes. Saldo actual: " + balance);
        } else  {
            balance -= amount;
            System.out.println("Retiro exitoso: $" + amount);
        }
    }

    public double getBalance() {
        return balance;
    }
}
