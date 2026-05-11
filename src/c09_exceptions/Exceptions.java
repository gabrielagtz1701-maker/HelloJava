package c09_exceptions;

public class Exceptions {

    public static void main(String[] args) {

        System.out.println("Hello");

        // Manejo de excepciones

        // try catch
        try {

            // Colocar código que potencialmente es suceptible a fallar
            var result = 10 / 0;
            System.out.println(result);

        } catch (Exception e) {
            // Tipo de error a capturar
            System.out.println("Error: " + e.getMessage());

        }

        // try con múltiples catch
        try {
            var result = 10/5;
            System.out.println(result);

            var name = "Gabriela";
            name = null;
            System.out.println("Name: " + name.toUpperCase());

        } catch (ArithmeticException e) {
            System.out.println("Error aritmético: " + e);
        } catch (NullPointerException e) {
            System.out.println("Error null pointer");
        } catch (Exception e) {
            System.out.println("Se ha producido un error");
        }

        // finally
        try {
            var result = 10/0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e);
        } finally {
            System.out.println("Fin del bloque try-catch");
        }

        // throw
        var throwExample = new ThowExample();

        try {
            throwExample.checkAge(15);
        } catch (IllegalArgumentException e) {
            System.out.println("Error revisando la edad: " + e.getMessage());
        }



        System.out.println("Fin");
    }
}
