package c08_oop.classesE;

public class Product {

    // Atributos
    double price;

    // Constructor
    public Product(double price) {
        this.price = price;
    }

    // Método
    public void Discount(double discount) {

        double originalPrice = price;
        double finalPrice = price * (discount / 100);
        price -= finalPrice;

        System.out.println(String.format(
                "Monto total: $%.2f. Descuento aplicado: %.2f%% | Precio final: $%.2f",
                originalPrice, discount, price)
        );
    }
}
