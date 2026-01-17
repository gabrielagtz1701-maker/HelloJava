public class BeginnerExercises {

    public static void main(String[] args) {

        // 1. Concatena dos cadenas de texto.
        String name = "Gabriela";
        String surname = "Gabriela";
        int age = 27;


        System.out.println("Hola, mi nombre es: " + name + " y tengo: " + age);

        // 2. Muestra la longitud de una cadena de texto.
        System.out.println(name + ". Longitud: " + name.length());

        // 3. Muestra el primer y último carácter de un string.
        System.out.println(name + ". Primer caracter: " + name.charAt(0));
        System.out.println(name + ". Ultimo caracter: " + name.charAt(name.length()-1));

        // 4. Convierte a mayúsculas y minúsculas un string.
        System.out.println("Mayusculas: " + name.toUpperCase());
        System.out.println("Minusculas: " + name.toLowerCase());

        // 5. Comprueba si una cadena de texto contiene una palabra concreta.
        var comprobacion = "Gabriela".contains("Gab");

        System.out.println("Gabriela contiene Gab en ella: " +  comprobacion);

        // 6. Formatea un string con un entero.
        System.out.println(String.format("Hola, me llamo %s mi edad es de %d", name, age));

        // 7. Elimina los espacios en blanco al principio y final de un string.
        System.out.println(" Mi nombre esta en la variable name. ".trim());

        // 8. Sustituye todos los espacios en blanco de un string por un guión (-).
        System.out.println(("Hola, mi nombre es: " + name).replace(" ", "-"));

        // 9. Comprueba si dos strings son iguales.
        var iguales = name.equals(surname);
        System.out.println("Name y surname son iguales?: " + iguales);

        // 10. Comprueba si dos strings tienen la misma longitud.

        var lvar = (name.length() == surname.length());
        System.out.println("Name y Surname tienen la misma longitud: " + lvar);

    }
}
