package c08_oop.AccessModifiersE;

public class Student {
    // Atributos
    private int grade;

    // Constructores
    public Student(int grade) {
        this.grade = grade;
        System.out.println("Estudiante creado con nota inicial");
    }

    // Métodos
    public void setGrade(int grade) {
        this.grade = grade;
    }

    public boolean isPassed() {
        return grade>= 60;
    }

}
