package c08_oop.AbstractionE;

public class Guitar implements Playable {

    @Override
    public void play() {
        System.out.println("Guitar");
    }

    @Override
    public void pay() {}
}
