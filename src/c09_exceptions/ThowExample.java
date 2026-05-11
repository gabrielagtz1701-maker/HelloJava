package c09_exceptions;

public class ThowExample {

    public void checkAge(int age) throws IllegalArgumentException {
        if (age < 18) {
            throw new IllegalArgumentException("Tienes que ser mayor de edad");
        } else {
            System.out.println("Es mayor de edad");
        }
    }

}
