package c05_structures;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class StructuresExercises {

    public static void main(String[] args) {

        // 1. Crea un Array con 5 valores e imprime su longitud.
        Integer[] array = {5, 20, 30};
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
        var hashSet = new HashSet<Integer>();
        hashSet.add(1);
        hashSet.add(2);
        System.out.println("HashSet con dos valores: " + hashSet);

        // 6. Añade un nuevo valor repetido y otro sin repetir al HashSet.
        System.out.println("HashSet sin elementos extras: " + hashSet);
        hashSet.add(2);
        hashSet.add(3);
        System.out.println("HashSet con valor repetido y sin repetir: " + hashSet);

        // 7. Elimina uno de los elementos del HashSet.
        hashSet.remove(3);
        System.out.println("HashSet con un elemento eliminado: " + hashSet);

        // 8. Crea un HashMap donde la clave sea un nombre y el valor el número de teléfono. Añade tres contactos.
        var hashMap = new HashMap<String, String> ();

        hashMap.put("Mario", "551234567890");
        hashMap.put("Juan", "550987654321");
        hashMap.put("Fulano", "5513579246");
        System.out.println("HashMap: " + hashMap);

        // 9. Modifica uno de los contactos y elimina otro.
        hashMap.replace("Mario", "5511223344");
        System.out.println("HashMap modificado: " + hashMap);

        hashMap.remove("Fulano");
        System.out.println("HashMap eliminado: " + hashMap);

        // 10. Dado un Array, transfórmalo en un ArrayList, a continuación en un HashSet y finalmente en un HashMap con clave y valor iguales.
        System.out.println(array);

        var list = new ArrayList<Integer>(Arrays.asList(array));
        System.out.println("Array convertido a ArrayList: " + list);

        var set = new HashSet<Integer>(list);
        System.out.println("ArrayList convertido a HashSet: " + set);

        var hMap = new HashMap<Integer, Integer>();
        for (Integer element : set) {
            hMap.put(element, element);
        }
        System.out.println("HashSet convertido a HashMap: " + hMap);
    }
}
