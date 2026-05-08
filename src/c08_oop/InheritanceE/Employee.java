package c08_oop.InheritanceE;

public class Employee {

    // Atributos
    protected String name;
    protected double salary;

    // Constructor
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        System.out.println("Employee created");
    }
}
