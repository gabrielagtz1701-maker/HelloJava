package c08_oop.PolymophirsmE;

public class Printer {

    // Métodos
    public void print(String text) {
        System.out.println("String: " + text);
    }

    public void print(int number) {
        System.out.println("Integer: " + number);
    }

    public void print(double value) {
        System.out.println("Double: " + value);
    }
}
