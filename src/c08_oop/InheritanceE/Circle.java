package c08_oop.InheritanceE;

public class Circle extends Shape{

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
}
