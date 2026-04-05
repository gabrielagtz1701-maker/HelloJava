package c05_structures;

import java.util.ArrayList;
import java.util.HashMap;

public class Maps {

    // Almacena un conjunto de pares clave:valor
    // Estructura desordenada

    public static void main(String[] args) {

        // Declaración y creación
        HashMap<String, String> names = new HashMap(); // Clasica
        var numbers = new HashMap<Integer, String>(); // Nueva

        // Tamaño
        System.out.println(names.size());

        // Añadir elementos
        names.put("Gabriela", "correo@correo.com");
        names.put("Gutierrez", "correo2@correo.com");
        names.put("Gabs", "correo3@correo.com");
        System.out.println(names.size());
        System.out.println(names);

        //Acceder a los elementos
        System.out.println(names.get("Gabriela"));
        System.out.println(names.get("SGGG"));

        // Verificar elementos
        System.out.println(names.containsKey("Gabriela"));
        System.out.println(names.containsKey("SGGG"));

        System.out.println(names.containsValue("correo@correo.com"));

        // Eliminar elementos
        System.out.println(names.remove("Gabriela"));
        System.out.println(names.remove("Gabs"));
        System.out.println(names);

        // Limpiar HashMap
        names.clear();
        System.out.println(names);

        // Otras operaciones
        names.put("Gabs", "correo3@correo.com");
        System.out.println(names);

        names.put("Gabs", "correo31@correo.com");
        System.out.println(names);

        names.replace("Gabriela", "correo@correo.com");
        System.out.println(names);

        names.putIfAbsent("Gabriela", "correo@correo.com");
        System.out.println(names);

        System.out.println(names.isEmpty());
        System.out.println(names.values());

        var values = names.values();
        System.out.println(values);

    }
}
