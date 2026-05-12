package c09_exceptions;

import c09_exceptions.ExceptionE.InvalidRemperatureException;
import c09_exceptions.ExceptionE.LoginFailedException;
import c09_exceptions.ExceptionE.LoginSystem;
import c09_exceptions.ExceptionE.TemperatureChecker;

public class ExcepcionExercises {

    public static void main(String[] args) {

        // 1. Divide dos números almacenados en dos variables. Maneja la división por cero con try-catch.

        double num1 = 10;
        double num2 = 20;

        try {
            var num3 = num1 / num2;
            System.out.println("Resultado: " + num3);
        } catch (ArithmeticException e) {
            System.out.println("Error: División entre cero no permitida");
        }

        // 2. Crea un array de 3 elementos e intenta acceder al índice 5. Captura el ArrayIndexOutOfBoundsException.
        int[] nums = {1, 2, 3};

        try {
            int valor = nums[0];
            System.out.println("Valor: " + valor);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Índice fuera del rango de arreglo");
        }

        // 3. Crea una variable String nula e intenta imprimir su longitud. Maneja el NullPointerException.
        String var3 = null;

        try{
            System.out.println("Longitud de texto: " + var3.length());
        } catch (NullPointerException e) {
            System.out.println("Error: La variable es nula");
        }

        // 4. Escribe una función que transforma texto a número. Usa try-catch para manejar entradas no válidas (NumberFormatException).
        String texto = "Hola";

        var number = convert(texto);
        System.out.println("Resultado: " + number);

        // 5. Escribe un programa con un bloque finally que se ejecute siempre, haya o no error.
        try {
            System.out.println("Dividiendo...");
            int div = 10/0;
            System.out.println("Resultado: " + div);
        } catch (ArithmeticException e) {
            System.out.println("Error: División entre 0 no válida");
        } finally {
            System.out.println("Proceso terminado");
        }

        // 6. Usa throw para lanzar un IllegalArgumentException si un número introducido es negativo.
        try {
            ejercicio6(-9);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // 7. Crea una clase InvalidRemperatureException que lanza una excepción personalizada si la temperatura es menor a -50 o mayor a 50.
        TemperatureChecker chec1 = new TemperatureChecker();

        try {
            chec1.check(80);
        } catch (InvalidRemperatureException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // 8. Crea un programa con varios bloques catch: uno para ArithmeticException, otro para ArrayIndexOutOfBoundsException.
        try {
            int res7 = 10/0;

            int[] num7 = {1, 2, 3};
            int var7 = num7[10];

            System.out.println("Resultado: " + res7);
            System.out.println("Valor: " + var7);
        } catch (ArithmeticException e) {
            System.out.println("Error: división entre cero no es posible");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: índice fuera del rango");
        }

        // 9. Crea una función checkPassword(String pass) que lance una excepción si la contraseña es demasiado corta.
        try {
            checkPassword("Gato");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // 10. Implementa una clase LoginSystem que use una excepción personalizada LoginFailedException si el usuario o contraseña son incorrectos.
        var system = new LoginSystem();

        try {
            system.login("admin", "789");
        } catch (LoginFailedException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    public static int convert(String texto) {
        try {
            return Integer.parseInt(texto);
        } catch (NumberFormatException e) {
            System.out.println("Error: El valor no es válido");
            return 0;
        }
    }

    public static void ejercicio6(int num6) {
        if (num6 < 0) {
            throw new IllegalArgumentException("El valor no puede ser negativo");
        }
        System.out.println("Número válido: " + num6);

    }

    public static void checkPassword(String pass) {
        if (pass.length() < 6) {
            throw new IllegalArgumentException(
                    "Contraseña demasiado corta"
            );
        }
        System.out.println("Contraseña válida");
    }
}
