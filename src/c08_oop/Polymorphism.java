package c08_oop;

public class Polymorphism {

    //Polimorfismo

    /*
    Para utilizar polimorfismo se tiene que utilizar herencia
    - Permite que distinto objetos respondan de forma diferente a los mismo métodos
     */

    public static void main(String[] args) {

         // Polimorfismo por herencia (sobreescritura)

        var animal = new Animal();
        animal.sound();

        var dog = new Dog();
        dog.sound();

        // Polimorfismo por sobrecarga (sobrecarga de métodos)

        var calculator = new Calculator();
        System.out.println(calculator.sum(3, 5));
        System.out.println(calculator.sum(3.2, 5.4));

    }

    // Polimorfismo por herencia (sobreescritura)
    public static class Animal {

        public void sound() {
            System.out.println("Algún sonido");
        }
    }

    public static class Dog extends Animal {

        @Override
        public void sound() {
            System.out.println("Guau");
        }
    }

    // Polimorfismo por sobrecarga (sobrecarga de métodos)

    public static class Calculator {

        public int sum (int a, int b) {
            return a + b;
        }

        public double sum (double a, double b) {
            return a + b;
        }
    }
}
