package c10_extras;

import java.util.Random;
import java.util.Scanner;

public class ExtrasExercises {

    // Variable global (atributo de la clase)
    static String message = "Variable global";
    static String ej6 = "Variable global ej6";

    public static void main(String[] args) {

        // 1. Crea una variable de tipo String inicializada como null y verifica que no esté vacía antes de usarla.
        String ej1 = null;
        if (ej1 != null && !ej1.isEmpty()) {
            System.out.println(ej1);
        } else {
            System.out.println("El texto es nulo o está vacío");
        }

        // 2. Escribe un programa que lea el nombre y edad del usuario usando Scanner.
        var ej2 = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        String nombre2 = ej2.nextLine();

        System.out.println("Ingrese su edad: ");
        int edad2 = ej2.nextInt();

        System.out.println(String.format("Bienvenid@ %s que bueno que tengas %d", nombre2, edad2));

        // 3. Declara una constante final llamada MAX_SCORE con valor 100 y muéstrala.
        final int MAX_SCORE = 100;
        System.out.println(String.format("Puntaje máximo: %d", MAX_SCORE));

        // 4. Crea una variable global message y otra local message dentro del método main(). Muestra ambas.
        String message = "Variable local";

        System.out.println(String.format("Variable local: %s", message));
        System.out.println(String.format("Variable global: %s", ExtrasExercises.message));

        // 5. Usa import java.util.Scanner; para leer un número y mostrar si es positivo o negativo.
        var ej5 = new Scanner(System.in);

        System.out.println("Ingresa un número: ");
        int num5 = ej5.nextInt();

        if (num5 >= 0) {
            System.out.println("El número es positivo");
        } else {
            System.out.println("El número es negativo");
        }

        // 6. Declara una variable static en una clase y accede a ella desde main() sin crear un objeto.
        System.out.println(ExtrasExercises.ej6);

        // 7. Importa java.util.Random y genera un número aleatorio del 1 al 10.
        var ej7 = new Random();

        int num7 = ej7.nextInt(10) + 1;

        System.out.println("Número aleatorio: " + num7);

        // 8. Crea una clase con comentarios adecuados explicando cada sección del código.

        // 9. Define una clase User con una constante APP_NAME, una variable global username y una función que imprima ambas.
        var ej9 = new User("Gabriela");
        ej9.printInfo();

        // 10. Haz debug del código implementado haciendo uso de sus diferentes herramientas.
    }
}
