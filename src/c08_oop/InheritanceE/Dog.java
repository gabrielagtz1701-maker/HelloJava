package c08_oop.InheritanceE;

public class Dog extends Animal {

    public Dog() {
        System.out.println("Dog creado");
    }

    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}
