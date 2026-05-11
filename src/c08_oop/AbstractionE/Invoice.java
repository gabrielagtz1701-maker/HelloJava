package c08_oop.AbstractionE;

public class Invoice implements Playable {

    @Override
    public void play() {
    }

    @Override
    public void pay() {
        System.out.println("Pagando factura de proovedor");
    }
}
