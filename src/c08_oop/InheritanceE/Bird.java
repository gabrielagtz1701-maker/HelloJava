package c08_oop.InheritanceE;

public class Bird extends Animal{

    // Constructor
    public Bird(){
    }

    // Método
    @Override
    public void makeSound() {
        System.out.println("Brrrr");
    }

    public void fly() {
        System.out.println("El ave está volando");
    }
}
