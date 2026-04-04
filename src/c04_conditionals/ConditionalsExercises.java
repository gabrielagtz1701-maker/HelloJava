package c04_conditionals;

public class ConditionalsExercises {
    public static void main(String[] args) {
        // 1. Establece la edad de un usuario y muestra si puede votar (mayor o igual a 18).

        var edad = 18;

        if (edad >= 18) {
            System.out.println("El usuario tiene la edad suficiente para votar");
        } else {
            System.out.println("El usuario NO tiene la edad suficiente para votar");
        }

        // 2. Declara dos números y muestra cuál es mayor, o si son iguales.

        var num1 = 15;
        var num2 = 52;

        if (num1 > num2) {
            System.out.println(String.format("El primer número es mayor que el segundo: %d > %d", num1, num2));
        } else if (num1 == num2) {
            System.out.println(String.format("Los números tienen el mismo valor: %d = %d", num1, num2));
        } else {
            System.out.println(String.format("El primer número es menor que el el segundo: %d < %d" , num1, num2));
        }

        // 3. Dado un número, verifica si es positivo, negativo o cero.

        var num3 = 0;

        if (num3 > 0) {
            System.out.println(String.format("El número %d es positivo",  num3));
        } else if (num3 < 0) {
            System.out.println(String.format("El número %d es negativo", num3));
        } else {
            System.out.println(String.format("El número %d es neutro",  num3));
        }

        // 4. Crea un programa que diga si un número es par o impar. (Se utiliza el operdor módulo %)

        var num4 = 0;

        if (num4 == 0) {
            System.out.println("El número es 0");
        } else if (num4 % 2 == 0) {
            System.out.println(String.format("El número %d es par", num4));
        } else {
            System.out.println(String.format("El número %d es impar", num4));
        }

        // 5. Verifica si un número está en el rango de 1 a 100.

        var num5 = 101;

        if (num5 >= 1 && num5 <= 100) {
            System.out.println(String.format("El número %d está en el rango de 1 a 100", num5));
        } else {
            System.out.println(String.format("El número %d sale del rango establecido", num5));
        }

        // 6. Declara una variable con el día de la semana (1-7) y muestra su nombre con switch.

        var num6 = 8;

        switch (num6) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Día de la semana no establecido");
        }

        // 7. Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o "Suspenso" según la nota (0-100).

        var num7 = -1;

        if (num7 >= 90 && num7 <= 100) {
            System.out.println("Sobresaliente");

        } else if (num7 <= 89 && num7 >= 60) {
            System.out.println("Aprobado");

        } else if (num7 <= 59 && num7 >= 0) {
            System.out.println("Suspenso");
        } else {
            System.out.println("Calificación fuera de rango");
        }

        // 8. Escribe un programa que determine si puedes entrar al cine: debes tener al menos 15 años o ir acompañado.

        var num8 = 14;
        var num81 = true;

        if (num8 >= 15 || num81) {
            System.out.println("Adelante, puede ingresar... Disfrute(n) su película!");
        } else {
            System.out.println("Lo siento, debe de venir acompañado para ingresar.");
        }

        // 9. Crea un programa que diga si una letra es vocal o consonante.

        var num90 = "*";

           // Validar que solo sea un caracter
        if (num90.length() == 1)  {

            //Validar que sea una letra
            if (Character.isLetter(num90.charAt(0))) {

                // Convertir a minúscula
                char num9 = Character.toLowerCase(num90.charAt(0));

                // Comprobar si es vocal
                if (num9 == 'a' || num9 == 'e' || num9 == 'i' || num9 == 'o' || num9 == 'u') {
                    System.out.println(String.format("La letra %s es una vocal", num90));
                } else {
                    System.out.println(String.format("La letra %s es una consonante", num90));
                }
            } else {
                System.out.println(String.format("El caracter %s no es una letra", num90));
            }
        } else {
            System.out.println("Error: Solo se permite ingresar una letra");
        }

        // 10. Usa tres variables a, b, c y muestra cuál es el mayor de las tres.

        var a = 9;
        var b = 8;
        var c = 17;

        if (a > b && a > c) {
            System.out.println(String.format("%d es mayor que %d y %d", a, b, c));
        } else if (b > a && b > c) {
            System.out.println(String.format("%d es mayor que %d y %d", b, a, c));
        } else if (c > a && c > b) {
            System.out.println(String.format("%d es mayor que %d y %d", c, a, b));
        } else if ( a == b && a == c) {
            System.out.println("Todos los valores son iguales");
        } else if (a == b || a == c || b == c) {
            System.out.println("Existen dos valores iguales");
        }
    }
}
