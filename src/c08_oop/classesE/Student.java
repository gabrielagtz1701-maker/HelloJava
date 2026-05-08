package c08_oop.classesE;

import c08_oop.InheritanceE.Person;

public class Student {

    // Atributos
    int score;

    // Constructor
    public Student(int score) {
        this.score = score;
    }

    // Métodos
    public void checkPR() {
        if(score >= 60) {
            System.out.println(String.format("Aprobó con %d",score));
        } else {
            System.out.println(String.format("Reprobó con %d", score));
        }
    }
}
