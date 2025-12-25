public class OperatorsExercises {

    public static void main(String[] args) {

        // 1. Crea una variable con el resultado de cada operación aritmética.
        var a = 10;
        var b = 20;

        var c = a + b;
        var d = a - b;
        var e = a / b;
        var f = a * b;
        var g = a % b;

        System.out.println("Suma: " + c);
        System.out.println("Resta: " + d);
        System.out.println("División: " + e);
        System.out.println("Multiplicación: " + f);
        System.out.println("Módulo: " + g);

        // 2. Crea una variable para cada tipo de operación de asignación.

        a = b;
        System.out.println("a = b: " + a);
        a += 10;
        System.out.println("a += 10: " + a);
        a -= 15;
        System.out.println("a -= 15: " + a);
        a *= 20;
        System.out.println("a *= 20: " + a);
        a /= 25;
        System.out.println("a /= 25: " + a);
        a %= 30;
        System.out.println("a %= 30: " + a);

        // 3. Imprime 3 comparaciones verdaderas con diferentes operadores de comparación.
        System.out.println("a: " + a + "\nb: " + b + "\nc: " + c + "\nd: " + d + "\ne: " + e + "\nf: " + f + "\ng: " + g);

        System.out.println(a != b);
        System.out.println(a > d);
        System.out.println(a >= e);

        // 4. Imprime 3 comparaciones falsas con diferentes operadores de comparación.

        System.out.println(a == b);
        System.out.println(c <= d);
        System.out.println(e > f);

        // 5. Utiliza el operador lógico and.
        System.out.println(a==b && b!=c);

        // 6. Utiliza el operador lógico or.
        System.out.println(a==b || b==c);

        // 7. Combina ambos operadores lógicos.
        System.out.println(a==b || a==c && b!=c);

        // 8. Añade alguna negación.
        System.out.println(!(a==b) || a==c && b!=c);

        // 9. Imprime 3 ejemplos de uso de operadores unarios.
        System.out.println("Valor de d: " + d);
        System.out.println(+d);
        System.out.println(-d);
        System.out.println(++d);

        // 10. Combina operadores aritméticos, de comparación y lógicos.
        System.out.println(!((a + b) == (c - d)));
    }
}
