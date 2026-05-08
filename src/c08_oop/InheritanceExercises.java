package c08_oop;

import c08_oop.InheritanceE.*;

import java.util.ArrayList;

public class InheritanceExercises {

    public static void main(String[] args) {

        // 1. Crea una clase Vehicle con un método move(). Luego crea una subclase Car que herede de Vehicle y agrega el método honk().
        var car1 = new Car();

        car1.move();
        car1.honk();

        // 2. Define una clase Person con los atributos name y age. Luego crea una clase Student que agregue el atributo grade y un método study().
        var st1 = new Student("Gabriela", 17, 1);
        st1.study();

        // 3. Crea una clase Animal con el método makeSound(). Haz que Dog diga “Woof” y Cat diga “Meow” sobrescribiendo ese método.
        var dog1 = new Dog();
        dog1.makeSound();

        var cat1 = new Cat();
        cat1.makeSound();

        // 4. La clase Employee tiene los atributos name y salary. Manager hereda de Employee y agrega el atributo department.
        var emp1 = new Manager("Gabriela", 5600, "Investigación");

        // 5. Crea una clase abstracta Shape con un método calculateArea(). Luego implementa ese método en Circle y Rectangle.
        var cir1 = new Circle(15);
        var rect1 = new Rectangle(5, 10);

        System.out.println(cir1.calculateArea());
        System.out.println(rect1.calculateArea());

        // 6. Crea una clase Bird con el método fly(). Luego crea Eagle que sobrescriba fly() pero también llame al método original con super.fly().
        var aguila1 = new Eagle();
        aguila1.fly();

        // 7. Haz una clase Device con un constructor que imprima “Device created”. Luego crea Phone que herede de Device y en su constructor imprima “Phone ready”.
        var ph1 = new Phone();

        // 8. Account tiene un saldo y métodos para deposit() y withdraw(). SavingsAccount hereda y agrega un método addInterest().
        var sa = new SavingAccount(1000, .5);
        sa.deposit(500);
        sa.withdraw(200);
        sa.addInterest();

        // 9. Crea una clase Vehicle y tres subclases: Car, Bike y Truck, cada una con un método describe() sobrescrito.
        var v1 = new Car();
        var v2 = new Bike();
        var v3 = new Truck();

        v1.describe();
        v2.describe();
        v3.describe();

        // 10. Crea un ArrayList<Animal> que contenga instancias de Dog, Cat y Bird. Recorre la lista y llama a makeSound().
        var animals = new ArrayList<Animal>();

        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Bird());

        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
