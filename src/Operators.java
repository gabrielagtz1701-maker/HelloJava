public class Operators {

    public static void main(String[] args) {

        //Operadores

        // Permiten realizar operaciones

        // Aritméticos (se utilizan para realizar operaciones matemáticas

        var a = 5;
        var b = 3;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b); // Modulo, lo que sobra de la división

        // Asignación (asignan valores a las variables)

        a = b;
        System.out.println(a);

        a = b * 2;
        System.out.println(a); // Operador =

        a += 1; // a = a + 1
        System.out.println(a);
        a -= 1; // a = a - 1
        System.out.println(a);
        a *= 2; // a = a * 2
        System.out.println(a);
        a /= 2; // a = a / 2
        System.out.println(a);
        a %= 2; // a = a % 2
        System.out.println(a);

        // Comparación (Relacionales que devuelven verdadero o falso)

        System.out.println(a == b); // Igualdad
        System.out.println(a == 0);
        System.out.println(a != b); // Desigualdad
        System.out.println(a > b); // Mayor que
        System.out.println(a >= b); // Mayor o igual que
        System.out.println(a < b); // Menor que
        System.out.println(a <= b); // Menor o igual que

        // Lógicos (combinan expresiones booleanas)

        System.out.println(true && true); // Y (AND)
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        System.out.println(3 > 2 && 5 == 2);

        System.out.println(true || true); // O (OR)
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        System.out.println(3 > 2 || 5 == 2);

        System.out.println(!true); // NO (NOT)
        System.out.println(!false);

        System.out.println(!(3 > 2) || 5 == 2);

        // Unarios (Operan sobre un solo operando)

        System.out.println("Valor de b: " + b);
        System.out.println(+b); // Mantiene el símbolo
        System.out.println(-b); // Cambia el símbolo
        System.out.println(++b); // Incrementa el valor antes de imprimirlo
        System.out.println(b++); // Imprime el valor y luego lo incrementa
        System.out.println(--b); // Reduce el valor y luego lo imprime
        System.out.println(b--); // Imprime el vaor y luego lo reduce

    }
}
