package c08_oop.PolymophirsmE;

public class Book extends Product{

    @Override
    public double getPrice() {
        return 100.0 * 0.90; // 10% de descuento
    }
}
