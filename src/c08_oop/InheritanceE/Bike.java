package c08_oop.InheritanceE;

public class Bike extends Vehicle{

    @Override
    public void describe() {
        System.out.println("This is a bike: light and eco-friendly.");
    }

    @Override
    public void start() {
        System.out.println("Bike starting...");
    }
}
