package c05_structures;

import java.util.ArrayList;

public class StructuresExercises {

    public static void main(String[] args) {

        // 1. Crea un Array con 5 valores e imprime su longitud.
        int[] array = new int[5];
        System.out.println("Longitud del array: " + array.length);

        // 2. Modifica uno de los valores del Array e imprime el valor del índice antes y después de modificarlo.
        System.out.println("Valor del indice antes: " + array[0]);
        array[0] = 10;
        System.out.println("Valor del indice despues: " + array[0]);

        // 3. Crea un ArrayList vacío.
        var arrayList = new ArrayList<String>();
        System.out.println("ArrayList vacio: " + arrayList);

        // 4. Añade 4 valores al ArrayList y elimina uno a continuación.
        arrayList.add("Uno");
        arrayList.add("Dos");
        arrayList.add("Tres");
        arrayList.add("Cuatro");

        System.out.println("ArrayList con cuatro valores: " + arrayList);
        arrayList.remove(3);
        System.out.println("ArrayList sin un elemento: " + arrayList);

        // 5. Crea un HashSet con 2 valores diferentes.

        // 6. Añade un nuevo valor repetido y otro sin repetir al HashSet.

        // 7. Elimina uno de los elementos del HashSet.

        // 8. Crea un HashMap donde la clave sea un nombre y el valor el número de teléfono. Añade tres contactos.

        // 9. Modifica uno de los contactos y elimina otro.

        // 10. Dado un Array, transfórmalo en un ArrayList, a continuación en un HashSet y finalmente en un HashMap con clave y valor iguales.
    }
}
