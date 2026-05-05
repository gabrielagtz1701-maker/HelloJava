package c08_oop.classesE;

public class Car {

    // Atributos
    String brand;
    String model;

    // Constructor
    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    // Métodos
    public void showData() {
        System.out.println(String.format("Brand: %s, Model: %s ", brand, model));
    }
}
