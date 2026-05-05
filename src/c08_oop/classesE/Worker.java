package c08_oop.classesE;

public class Worker {

    // Atributos
    String nameW;
    double salary;

    // Constructor
    public Worker(String nameW, double salary) {
        this.nameW = nameW;
        this.salary = salary;
    }

    // Métodos
    public void salarioW() {
        System.out.println(String.format(
                "El trabajador %s tiene un salario de $%.2f",
                nameW,
                salary
        ));
    }
}
