package c07_functions;

import java.util.ArrayList;
import java.util.Arrays;

public class Functions {

    public static void main(String[] args) {

        // Funciones

        // Bloque de código que realiza una tarea específica y es reutilizable

        for (int index = 0; index < 5; index++) {
            System.out.println("Hello Java!");
            sendEmail();
            sendEmailToUser("correo@correo.com");
            sendEmailToUser("correo@correo.com", "Gabriela");
        }

        // ...

        sendEmail();

        sendEmailToUser("correo@correo.com");
        sendEmailToUser("correo@correo.com", "Gabriela");

        var users = new ArrayList<>(Arrays.asList("Gabriela@correo.com", "Gutierrez@correo.com"));
        sendEmailToUser(users);
    }

    // Función sin parámetros ni retorno
    public static void sendEmail() {
        System.out.println("Hello Javaaaaa!");
    }

    // Función con parámetros
    public static void sendEmailToUser(String email) {
        System.out.println("Se envia el email a " + email );
    }

    public static void sendEmailToUser(String email, String name) {
        System.out.println("Se envia el email a " + name + " (" + email + ")");
    }

    public static void sendEmailToUser(ArrayList<String> emails) {
        for (String email : emails) {
            System.out.println("Se envia el email a " + email);
        }
    }

}
