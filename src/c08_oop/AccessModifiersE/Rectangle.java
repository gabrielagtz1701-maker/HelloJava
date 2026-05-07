package c08_oop.AccessModifiersE;

public class Rectangle {

    // Atributos
    private double width;
    private double height;

    // Constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        System.out.println("Rectángulo creado con éxito");
    }

    // Métodos
    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double calculateArea() {
        double area = width * height;
        System.out.println(String.format("El área del rectangulo es de %.2f", area));
        return area;
    }
}
