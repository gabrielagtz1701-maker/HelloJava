package c08_oop.InheritanceE;

public class Rectangle extends Shape{

    // Atributos
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}
