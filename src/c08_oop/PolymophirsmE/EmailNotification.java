package c08_oop.PolymophirsmE;

public class EmailNotification extends Notification{

    @Override
    public void send() {
        System.out.println("Sending email...");
    }
}
