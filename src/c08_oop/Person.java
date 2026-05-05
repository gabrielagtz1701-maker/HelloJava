package c08_oop;

public class Person {

    // Atributos
    String name;
    int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Métodos
    public void sayHello() {

        System.out.println(String.format("Hola soy %s y tengo %d", name, age));

    }
}
