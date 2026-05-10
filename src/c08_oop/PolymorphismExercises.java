package c08_oop;

import c08_oop.InheritanceE.*;
import c08_oop.PolymophirsmE.*;
import c08_oop.PolymophirsmE.Character;

import java.util.ArrayList;

public class PolymorphismExercises {

    public static void main(String[] args) {

        // 1. Crea una clase Animal con el método makeSound(). Luego crea subclases Dog, Cat y Cow que sobrescriban ese método con sonidos diferentes. Llama al método desde una lista de Animal.
        var animals = new ArrayList<Animal>();
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Cow());

        for (Animal animal : animals) {
            animal.makeSound();
        }

        // 2. Crea una clase Shape con el método calculateArea(). Luego implementa subclases Circle y Rectangle con sus propias fórmulas. Usa una lista de Shape para recorrer e imprimir el área de varias figuras.
        var shapes = new ArrayList<Shape>();
        shapes.add(new Circle(5));
        shapes.add(new Rectangle(4, 6));

        for (Shape shape : shapes) {
            System.out.println(shape.calculateArea());
        }

        // 3. Crea una clase Printer con varios métodos print() sobrecargados que acepten diferentes tipos de parámetros (String, int, double). Llama a cada uno desde main.
        var print1 = new Printer();
        print1.print(5);
        print1.print("Cinco");
        print1.print(5.0);

        // 4. Crea una clase Greeter con dos métodos greet(): uno que salude con “Hello”, y otro que reciba un nombre y salude con “Hello, [nombre]”.
        var gre1 = new Greeter();
        gre1.greet();
        gre1.greet("Gabriela");

        // 5. Crea una clase Vehicle con un método start(). Luego crea Car, Bike y Truck que sobrescriban ese método. Recorre una lista ArrayList<Vehicle> para llamar a start() en cada uno.
        var vehicles = new ArrayList<Vehicle>();
        vehicles.add(new Car());
        vehicles.add(new Bike());
        vehicles.add(new Truck());

        for (Vehicle vehicle : vehicles) {
            vehicle.start();
        }

        // 6. Crea una clase Notification con método send(), y subclases EmailNotification, SMSNotification. Luego crea una función sendNotification(Notification n) que reciba cualquier tipo y lo ejecute.

        sendNotification(new EmailNotification());
        sendNotification(new SMSNotification());

        // 7. Crea una función showAnimalType(Animal animal) que imprima el tipo de animal. Pasa diferentes subclases (Dog, Cat, Horse) para que cada una imprima su tipo con su propio getType() sobrescrito.
        showAnimalType(new Dog());
        showAnimalType(new Cat());
        showAnimalType(new Horse());

        // 8. Crea una clase Converter con métodos convert(int), convert(double), y convert(String) que devuelvan diferentes formatos de texto.
        Converter c = new Converter();

        System.out.println(c.convert(10));
        System.out.println(c.convert(3.1416));
        System.out.println(c.convert("Hola Gabriela"));

        // 9. Crea una clase Product con el método getPrice(). Luego, Book y Electronic deben sobrescribirlo con su propia lógica de descuento. Recorre una lista de Product e imprime el precio final de cada uno.
        var products = new ArrayList<Product>();

        products.add(new Book());
        products.add(new Electronic());
        products.add(new Product()); // Precio base

        for (Product product : products) {
            System.out.println("Precio final: " + product.getPrice());
        }

        // 10. Crea una clase Character con método attack(). Luego crea subclases Warrior, Archer, Mage con ataques diferentes. En main, crea un array de Character y llama a attack() para cada uno.
        Character[] characters = {
                new Warrior(),
                new Archer(),
                new Mage()
        };

        for (Character character : characters) {
            character.attack();
        }
    }

    public static void sendNotification(Notification n) {
        n.send();
    }

    public static void showAnimalType(Animal animal) {
        System.out.println(animal.getType());
    }
}
