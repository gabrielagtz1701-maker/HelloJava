package c08_oop.InheritanceE;

public class Car extends Vehicle{

    public void honk() {
        System.out.println("Beep!! Beep!!");
    }

    @Override
    public void describe() {
        System.out.println("This is a car");
    }

    @Override
    public void start() {
        System.out.println("Car starting...");
    }
}
