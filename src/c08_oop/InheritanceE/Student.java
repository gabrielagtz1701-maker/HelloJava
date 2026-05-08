package c08_oop.InheritanceE;

public class Student extends Person{

    // Atributos
    private int grade;

    // Constructores
    public Student(String name, int age, int grade){
        super(name, age); // Llama al constructor de Person
        this.grade = grade;
        System.out.println("Student creado con grado: " + grade);

    }

    // Métodos
    public void study(){
        System.out.println(String.format("El estudiante %s del grado %d tiene %d años de edad", name, grade, age));
    }



}
