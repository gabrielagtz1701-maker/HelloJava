package c08_oop;
import c08_oop.classesE.*;
import c08_oop.classesE.Person;

import java.util.ArrayList;

public class ClassesExercises {

    public static void main(String[] args) {

        // 1. Crea una clase Book con atributos title y author. Crea un objeto y muestra sus datos.
        var book1 = new Book("Harry Potter", "J. K. Rowling");
        book1.pBook();

        // 2. Crea una clase Dog con un método bark() que imprima su sonido.
        var dog1 = new Dog();
        dog1.bark();

        // 3. Añade un constructor a la clase Book que reciba title y author.
        var book2 = new Book("Cien años de Soledad", "Gabriel García Márquez");
        book2.pBook();

        // 4. Crea una clase Car con atributos brand y model y un método showData().
        var car1 = new Car("Onix", "2024");
        car1.showData();

        // 5. Crea una clase Student con atributo score y un método que diga si aprobó (mayor o igual a 60).
        var student1 = new Student(60);
        student1.checkPR();

        // 6. Crea una clase BankAccount con atributo balance y un método deposit() que sume el saldo.
        var bankAccount1 = new BankAccount(60);
        bankAccount1.deposit(100);

        var bankAccount2 = new BankAccount(50);
        bankAccount2.deposit(200);

        // 7. Crea una clase Rectangle con métodos para calcular el área y el perímetro.
        var rect1 = new Rectangle(60, 100);
        rect1.print();


        // 8. Crea una clase Worker que reciba nombre y salario, y un método para mostrar su salario.
        var worker1 = new Worker("Juan Gonzalez", 1500);
        worker1.salarioW();

        // 9. Crea varios objetos Person y guárdalos en un ArrayList.
        ArrayList<Person> person = new ArrayList<>();

        person.add(new Person("Juana"));
        person.add(new Person("Gabriel"));
        person.add(new Person("Segundo"));

        Person.personArray(person);

        // 10. Crea una clase Product y un método que aplique un descuento sobre su precio.
        var product1 = new Product(1000);
        var product2 = new Product(2000);

        product1.Discount(50);
        product2.Discount(10);

    }
}
