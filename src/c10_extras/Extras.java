package c10_extras;

import c08_oop.*; // Utilizar todo el paquete

import java.util.Scanner;

public class Extras {

    // Variable globlas
    static String globalName = "Gabriela";

    public static void main(String[] args) {

        // Extras

        // null (ausencia de valor, solo se puede utilizar con Objetos)

        String name = "Gabriela";
        name = null;
        if (name != null) {
            System.out.println(name.toLowerCase());
        }

        // import
        new Person("Gabriela", 28, "001");
        new Classes();

        // Scanner (solicitar datos al usuario)
        var scanner = new Scanner(System.in);

        System.out.println("Introduce tu edad: ");
        var age = scanner.nextInt();
        System.out.println(age);

        // Scope: variables locales y globales
        test();

        // static (pertenece a la clase a nivel global, no se necesita instanciar)

    }

    public static void test() {
        System.out.println(globalName);
    }
}
