package c08_oop;

import c08_oop.classesE.Dog;

public class Inheritance {

    /*
    Herencia (es un)

    - Permite que una clase herede atributos y métodos de otra
    - Se debe establecer un sistema de subclases
    - Permite que extienda una clase de una superclase
    - Permite especializar el comportamiento de una clase
    - Java solo permite hacer herencia simple
     */

    public static void main(String[] args) {
        // Herencia
        var animal = new Animal("Mi animal");
        //animal.name = "Mi animal";
        animal.eat();

        var dog = new Dog("Valen-tín", 12);
        //dog.name = "Valen-tín";
        dog.eat();

        var cat = new Cat("Luna");
        //cat.name = "Luna";
        cat.eat();

        var bird = new Bird("Happy");
        //bird.name = "Happy";
        bird.eat();
        bird.fly();
    }

    public static class Animal {

        String name;

        // Constructor
        public Animal(String name) {
            this.name = name;
        }

        // Métodos

        public void eat() {
            System.out.println("El animal con nombre " + name  + " está comiendo");
        }

    }

    public static class Dog extends Animal {

        int age;

        public Dog(String name, int age) {
            super(name);
            this.age = age;
        }

        @Override // Indica sobre escritura de métodos
        public void eat() {
            //super.eat(); // Hace referencia a la superclase
            System.out.println("El perro con nombre " + name  + " está comiendo");
        }
    }

    public static class Cat extends Animal{

        public Cat(String name) {
            super(name);
        }
    }

    public static class Bird extends Animal {

        public Bird(String name) {
            super(name);
        }

        public void fly() {
            System.out.println("Está volando");
        }
    }

}
