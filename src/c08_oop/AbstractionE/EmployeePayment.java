package c08_oop.AbstractionE;

public class EmployeePayment implements  Playable {

    @Override
    public void pay() {
        System.out.println("Pagando salario a empleado");
    }

    @Override
    public void play() {}
}
