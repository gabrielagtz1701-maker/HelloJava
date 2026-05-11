package c08_oop.AbstractionE;

public class TV extends Appliance{

    @Override
    public void turnOff() {
        System.out.println("TV turnOff");
    }

    @Override
    public  void turnOn() {
        System.out.println("TV turn on");
    }
}
