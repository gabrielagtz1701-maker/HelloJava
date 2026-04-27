package c07_functions;

import java.util.ArrayList;
import java.util.Arrays;

public class FunctionsExercises {

    public static void main(String[] args) {

        // 1. Crea una función que imprima "¡Te doy la bienvenida al curso de Java desde cero!".
        ejercicio1();

        // 2. Escribe una función que reciba un nombre como parámetro y salude a esa persona.
        ejercicio2("Gabriela");

        // 3. Haz un método que reciba dos números enteros y devuelva su resta.
        ejercicio3(5,1);

        // 4. Crea un método que calcule el cuadrado de un número (n * n).
        ejercicio4(2);

        // 5. Escribe una función que reciba un número y diga si es par o impar.
        ejercicio5(5);

        // 6. Crea un método que reciba una edad y retorne true si es mayor de edad (y false en caso contrario).
        ejercicio6(18);

        // 7. Implementa una función que reciba una cadena y retorne su longitud.
        ejercicio7("ejercicio7");

        //  8. Crea un método que reciba un array de enteros, calcula su media y lo retorna.
        int[] ej8 = {10,12,10};
        ejercicio8(ej8);

        // 9. Escribe un método que reciba un número y retorna su factorial.
        ejercicio9(5);

        // 10. Crea una función que reciba un ArrayList<String> y lo recorra mostrando cada elemento.
        ArrayList<String> lista = new ArrayList<>();
        lista.add("ejercicio");
        lista.add("ejercicio1");
        lista.add("ejercicio10");

        ejercicio10(lista);

    }

    // Funciones

    public static void ejercicio1() {
        System.out.println("¡Te doy la bienvenida al curso de Java desde cero!");
    }

    public static void ejercicio2(String name) {
        System.out.println(String.format("Hola %s. ¡Bienvenida al curso de Java", name));
    }

    public static int ejercicio3(int a, int b) {
        int resta = a - b;
        System.out.println(String.format("La resta de %d y %d es %d",a,b,resta));
        return resta;
    }

    public static int ejercicio4(int n4) {
        int cuadrado = n4 * n4;
        System.out.println(String.format("El cuadrado de %d es %d",n4,cuadrado));
        return cuadrado;
    }

    public static void ejercicio5(int n5) {
        if (n5 % 2 == 0) {
            System.out.println(String.format("El número %d es par.", n5));
        } else {
            System.out.println(String.format("El número %d es impar.", n5));
        }
    }

    public static boolean ejercicio6(int n6) {
        if (n6 >= 18) {
            System.out.println(true + "... Used es mayor de edad");
            return true;
        } else {
            System.out.println(false + "... Used es menor de edad");
            return false;
        }
    }

    public static int ejercicio7(String n7) {
        System.out.println(String.format("%s tiene una longitud de...%s",n7,n7.length()));
        return n7.length();
    }

    public static double ejercicio8(int[] n8) {
        int suma8 = 0;
        for (int n8s : n8) {
            suma8 += n8s;
        }

        double m8 =  (double) suma8 / n8.length;

        System.out.println(String.format("La media de los numeros %s es %.2f", Arrays.toString(n8),m8));

        return m8;
    }

    public static long ejercicio9(int n9) {

        long facto = 1;
        for (int i9 = 1; i9 <= n9; i9++) {
            facto *= i9;
        }

        System.out.println(String.format("El factorial de %d es %d",n9,facto));
        return facto;
    }

    public static void ejercicio10(ArrayList<String> lista10) {
        for (String e10 : lista10) {
            System.out.println(String.format("Los elementos del ArrayList son: %s", e10));
        }
    }

}
