package c06_loops;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Loops {
    // Loops o Bucles
    /*
    Permite ejecutar un mismo bloque de código varias veces
     */
     public static void main(String[] args) {

         // Loops
         System.out.println("Hello World");

         // - for controlado por contador
         for (int index = 0; index < 5; index++) { // Donde empieza el contador, hasta donde va a llegar, como se va a mover
             System.out.println("Hello Java!");
         }

         String[] names = {"Gabriela", "Gutierrez", "GABS"};

         for (int index = 0; index < names.length; index++) {
             System.out.println(names[index]);
         }

         // - for each (ideal para recorrer arrays o listas)

         for (String name: names) {
             System.out.println(name);
         }

         HashSet<Integer> numbers = new HashSet<>();
         numbers.add(1);
         numbers.add(2);
         numbers.add(3);
         numbers.add(4);
         numbers.add(5);

         for(Integer number: numbers) {
             System.out.println(number);
         }

         HashMap<String, String> emails = new HashMap<>();
         emails.put("Gabriela", "correo@correo.com");
         emails.put("Gutierrez", "correo2@correo.com");
         emails.put("Gabs", "correo3@correo.com");

         for (Map.Entry<String, String> email: emails.entrySet()) {
             System.out.println(email.getKey() + ": " + email.getValue());
         }





     }
}
