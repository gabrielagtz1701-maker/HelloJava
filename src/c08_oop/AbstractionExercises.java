package c08_oop;

import c08_oop.AbstractionE.*;
import c08_oop.InheritanceE.Car;
import c08_oop.InheritanceE.Circle;
import c08_oop.InheritanceE.Rectangle;
import c08_oop.InheritanceE.Shape;

public class AbstractionExercises {

    public static void main(String[] args) {

        // 1. Crea una clase abstracta Shape con el método calculateArea(). Luego implementa dos subclases: Circle y Rectangle, y haz que cada una calcule su propia área.
        Shape s1 = new Circle(5);
        Shape s2 = new Rectangle(5, 10);

        System.out.println(s1.calculateArea());
        System.out.println(s2.calculateArea());

        // 2. Crea una interfaz Playable con el método play(). Luego implementa esa interfaz en dos clases: Guitar y Piano. Cada una debe mostrar un mensaje diferente al ejecutarse.
        Playable p1 = new Guitar();
        Playable p2 = new Piano();

        p1.play();
        p2.play();

        // 3. Define una clase abstracta Animal con el método makeSound(). Implementa Dog y Cat para que hagan sonidos distintos. Crea un array de Animal para mostrar polimorfismo.
        Animal[] animals = {
                new Dog(),
                new Cat()
        };

        for (Animal a : animals) {
            a.makeSound();
        }

        // 4. Crea una interfaz Drawable. Implementa las clases Circle, Square, y Triangle que muestren cómo se dibuja cada figura usando draw().
        Drawable[] shapes = {
                new Circle(10),
                new Square(),
                new Triangle()
        };

        for (Drawable d : shapes) {
            d.draw();
        }

        // 5. Crea una clase abstracta Employee con un método calculateSalary(). Implementa FullTimeEmployee y PartTimeEmployee con lógica diferente para calcular el salario.
        var e1 = new FullTimeEmployee(18000);
        var e2 = new PartTimeEmployee(40, 120);

        System.out.println(e1.calculateSalary());
        System.out.println(e2.calculateSalary());

        // 6. Crea una interfaz Movable con el método move(). Haz que las clases Car y Robot implementen ese método con comportamientos diferentes.
        var m1 = new Car();
        var m2 = new Robot();

        m1.move();
        m2.move();

        // 7. Crea una clase abstracta Appliance con método turnOn() y turnOff(). Implementa TV y WashingMachine con mensajes diferentes al encender y apagar.
        var tv1 = new TV();
        var wm1 = new WashingMachine();

        tv1.turnOff();
        tv1.turnOn();

        wm1.turnOff();
        wm1.turnOn();

        // 8. Crea dos interfaces Flyable y Swimmable. Crea una clase Duck que implemente ambas interfaces y muestre cómo puede volar y nadar.
        var d1 = new Duck();

        d1.fly();
        d1.swim();

        // 9. Crea una clase abstracta Document con el método print(). Luego crea PDFDocument y WordDocument, cada una con su forma de imprimir.
        var do1 = new PDFDocument();
        var d2 = new WordDocument();

        do1.print();
        d2.print();


        // 10. Crea una interfaz Payable con el método pay(). Luego implementa las clases Invoice y EmployeePayment, cada una mostrando un mensaje de pago diferente.
        var pa1 = new Invoice();
        var pa2 = new EmployeePayment();

        pa1.pay();
        pa2.pay();
    }
}
