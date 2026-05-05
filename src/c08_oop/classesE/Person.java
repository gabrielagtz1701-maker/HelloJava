package c08_oop.classesE;

import java.util.ArrayList;

public class Person {

    // Atributos
    String name;

    // Constructor
    public Person(String name) {
        this.name = name;
    }

    // Metodo
    public static void personArray(ArrayList<Person> person) {
        for (int i = 0; i < person.size(); i++) {
            System.out.println(String.format("%d - %s",i + 1, person.get(i).name));
        }
    }
}
