package c08_oop.AccessModifiersE;

public class Car {

    // Atributo
    private int speed;

    // Constructor
    public Car(int speed) {
        this.speed = speed;
        System.out.println("Velocidad inicial: " + speed);
    }

    // Método
    public void accelerate(int amount) {
        speed += amount;
        if (speed > 120) {
            speed = 120;
            System.out.println("Velocidad límite alcanzada: " + speed);
        }
        System.out.println("Velocidad alcanzada: " + speed);
    }


    public void brake(int amount) {
        speed -= amount;
        if (speed < 0) {
            speed = 0;
        }
        System.out.println("Velocidad alcanzada: " + speed);
    }
}
