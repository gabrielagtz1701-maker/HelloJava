package c05_structures;

import java.util.ArrayList;

public class List {

    // Solución más flexible
    // Estructura dinámica, almacena elementos sin necesidad de declara un tamaño fijo
    // Estructura ordenada por orden de llegada
    // Trabaja siempre con objetos

    public static void main(String[] args) {

        // Declaración y creación
        ArrayList<String> names = new ArrayList<>(); // Clasica
        var numbers = new ArrayList<Integer>(); // Nueva

        // Tamaño
        System.out.println(names.size());

        // Añadir elementos
        names.add("Gabriela");
        names.add("Gutierrez");
        names.add("Gabs");
        System.out.println(names.size());

        //Acceder a los elementos
        System.out.println(names.getFirst());
        System.out.println(names.get(1));
        System.out.println(names.getLast());

        // Modificar elementos
        names.set(2, "correo@correo.com");
        System.out.println(names.getLast());

        // Eliminar
        names.remove(2);
         //System.out.println(names.get(2)); Error porque ya no existe
        System.out.println(names.size());

        // Buscar elementos
        System.out.println(names.contains("Gabriela"));
        System.out.println(names.contains("correo@correo.com"));

        // Limpiar ArrayList
        names.clear();
        System.out.println(names.size());

    }
}
