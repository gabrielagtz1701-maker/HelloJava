package c08_oop.InheritanceE;

public class Truck extends Vehicle {

    @Override
    public void describe() {
        System. out.println("This is a truck: strong and built for heavy loads.");
    }

    @Override
    public void start() {
        System.out.println("Truck starting...");
    }
}
