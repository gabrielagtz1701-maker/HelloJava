package c08_oop.PolymophirsmE;

public class Electronic extends Product{

    @Override
    public double getPrice() {
        return 100.0 * 0.80; // 20% de descuento
    }
}
