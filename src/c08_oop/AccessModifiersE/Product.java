package c08_oop.AccessModifiersE;

public class Product {

    // Atributos
    private double price;

    // Constructor
    public Product(double price) {
        if (price > 0) {
            this.price = price;
            System.out.println("Costo ingresado: " + price);
        } else {
            System.out.println("Price invalido. Se asigna $0.00 por defecto");
            this.price = 0;
        }
    }

    // Métodos
    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
            System.out.println("Costo actualizado: " + price);
        } else {
            System.out.println("Price invalido. No se actualizo el valor");
        }
    }

    public double getPrice() {
        return price;
    }
}
