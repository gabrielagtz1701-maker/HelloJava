package c08_oop.InheritanceE;

public class Cat extends Animal {
    public Cat() {
        System.out.println("Cat creado");
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    @Override
    public String getType() {
        return "Cat";
    }
}
