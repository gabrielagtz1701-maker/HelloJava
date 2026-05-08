package c08_oop.InheritanceE;

public class SavingAccount extends Account{

    // Atributo
    private double interestRate;

    // Constructor
    public SavingAccount(double balance, double interestRate) {
        super(balance);
        this.interestRate = interestRate;
    }

    // Método
    public void addInterest() {
        double interest = interestRate * balance;
        balance += interest;
        System.out.println("Interés agregado: " + interest + ". Nuevo saldo: $" + balance);
    }

}
