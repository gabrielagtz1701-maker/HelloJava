package c08_oop.AbstractionE;

public class Robot implements Movable{

    @Override
    public void move() {
        System.out.println("El robot camina a saltos");
    }
}
