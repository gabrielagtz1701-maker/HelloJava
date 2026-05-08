package c08_oop.InheritanceE;

public class Manager extends Employee {

    // Atributo
    private String department;

    // Constructor
    public Manager(String name, double salary, String department){
        super(name, salary);
        this.department = department;
        System.out.println("Manager created");
    }

}
