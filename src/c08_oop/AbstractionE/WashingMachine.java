package c08_oop.AbstractionE;

public class WashingMachine extends Appliance{

    @Override
    public void turnOff() {
        System.out.println("WashingMachine turn off");
    }

    @Override
    public void turnOn() {
        System.out.println("WashingMachine turn on");
    }
}
