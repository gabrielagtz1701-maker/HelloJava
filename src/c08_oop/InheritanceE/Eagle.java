package c08_oop.InheritanceE;

public class Eagle extends Bird{

    // Constructor
    public Eagle() {
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("El águila es rápida");
    }
}
