package c08_oop.InheritanceE;

import c08_oop.AbstractionE.Movable;

public class Car extends Vehicle implements Movable {

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

    @Override
    public void move() {
        System.out.println("El carro avanza sobre ruedas");
    }
}
