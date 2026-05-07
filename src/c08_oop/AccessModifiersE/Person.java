package c08_oop.AccessModifiersE;

public class Person {

    // Atributos
    private String name;
    private int age;

    // Contstructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters (devuelven valor al atributo)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    //Setters (Asigna valor al atributo)
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
