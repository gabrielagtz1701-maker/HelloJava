package c08_oop.classesE;

public class Rectangle {

    // Atributos
    double width;
    double height;

    // Constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Método
    public double area() {
        double area = 0;
        area = width * height;
        return area;
    }

    public double perimeter() {
        double perimeter = 0;
        perimeter = 2*(width + height);
        return perimeter;
    }

    public void print() {
        System.out.println(String.format("El área del rectangulo es: %.2f y su perímetro es %.2f", area(), perimeter()));
    }
}
