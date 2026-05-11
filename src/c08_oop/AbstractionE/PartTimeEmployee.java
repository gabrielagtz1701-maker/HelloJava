package c08_oop.AbstractionE;

public class PartTimeEmployee extends Employee {

    private double hours;
    private double rate;

    public PartTimeEmployee(double hours, double rate) {
        this.hours = hours;
        this.rate = rate;
    }

    @Override
    public double calculateSalary() {
        return hours * rate;
    }
}
