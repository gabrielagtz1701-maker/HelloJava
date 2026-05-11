package c08_oop;

public class Composition {

    public static void main(String[] args) {

        // Composicion (tiene un)
        /*
        No se limita a la superclase
        Se instancia cada elemento con su comportamiento
         */

        var car = new Car();
        car.on();

    }

    public static class Engine {

        public void on() {
            System.out.println("Motor encendido");
        }
    }

    public static class Car {
        final private Engine engine = new Engine(); // Propiedad de la clase coche, instanciar coche

        public void on() {
            engine.on();
        }
    }
}
