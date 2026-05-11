package c08_oop.AbstractionE;

public class FullTimeEmployee extends  Employee {

    private double monthSalary;

    public FullTimeEmployee(double monthSalary) {
        this.monthSalary = monthSalary;
    }

    @Override
    public double calculateSalary() {
        return monthSalary;
    }
}
