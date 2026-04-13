package c06_loops;

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

         // -





     }
}
