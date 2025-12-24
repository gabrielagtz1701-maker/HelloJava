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

    }
}
