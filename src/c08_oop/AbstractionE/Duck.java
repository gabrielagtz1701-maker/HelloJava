package c08_oop.AbstractionE;

public class Duck implements Flyable, Swimmable {

    @Override
    public void fly() {
        System.out.println("El pato vuela");
    }

    @Override
    public void swim() {
        System.out.println("El pato nada");
    }

}
