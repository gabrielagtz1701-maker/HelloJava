package c10_extras;

// Clase principal del objeto
public class ExtrasEjercicio8 {

    // Atributo de ejemplo: representa un mensaje general
    private static String mensaje = "Hola desde la clase Ejercicio8";

    // Método principal: punto de entrada del programa
    public static void main(String[] args) {

        // Variable local que almacena un número
        int numero = 10;

        // Llamada a un método que muestra información
        mostrarInformacion(numero);
    }

    // Método que imprime el mensaje y el número recibido
    private static void mostrarInformacion(int valor) {

        // Imprime el mensaje global
        System.out.println("Mensaje: " + mensaje);

        // Imprime el valor recibido como parámetro
        System.out.println("Valor recibido: " + valor);
    }
}
