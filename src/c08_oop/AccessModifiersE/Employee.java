package c08_oop.AccessModifiersE;

public class Employee {

    // Atributos
    private double salary;

    // Método para aumentar salario
    public void raiseSalary(double percent) {
        if (percent > 0) {
            salary += salary * (percent / 100);
            System.out.println("Aumento aplicado: " + percent);
        } else {
            System.out.println("El aumento debe ser positivo");
        }
    }

}
