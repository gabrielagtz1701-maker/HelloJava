package c08_oop.InheritanceE;

import c08_oop.AbstractionE.Drawable;

public class Circle extends Shape implements Drawable {

    // Atributos
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Método
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Dibujando un Circulo");
    }

}

