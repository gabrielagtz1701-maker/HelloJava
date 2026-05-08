package c08_oop.InheritanceE;

public class Person {

    // Atributos
    protected String name;
    protected int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Persona creada: " + name);
    }

}
