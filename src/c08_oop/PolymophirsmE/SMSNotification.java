package c08_oop.PolymophirsmE;

public class SMSNotification extends Notification{

    @Override
    public void send() {
        System.out.println("Sending SMS...");
    }
}
