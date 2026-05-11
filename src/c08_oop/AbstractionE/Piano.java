package c08_oop.AbstractionE;

public class Piano implements Playable {

    @Override
    public void play() {
        System.out.println("Piano");
    }

    @Override
    public void pay() {}
}
