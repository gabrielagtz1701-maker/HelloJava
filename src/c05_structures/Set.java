package c05_structures;

import java.util.HashSet;

public class Set {

    // Estructura que solo almacena datos unicos, no permite duplicados
    // No son ordenadas

    public static void main(String[] args) {

        //Declaracion y creacion
        HashSet<String> names = new HashSet<>();
        var numbers = new HashSet<Integer>();

        //Tamaño
        System.out.println(names.size());

        // Añadir elementos
        names.add("Gabriela");
        names.add("Gutierrez");
        names.add("Gabs");
        names.add("correo@correo.com");
        System.out.println(names.size());
        System.out.println(names);

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        // Eliminar
        names.remove("Gabriela");
        System.out.println(names.size());

        // Buscar elementos
        System.out.println(names.contains("Gabriela"));
        System.out.println(names.contains("correo@correo.com"));

        System.out.println(names);
        names.add("Gutierrez");
        names.add("Gutierrez");
        System.out.println(names);

        //Conjuntos
            //names.addAll(numbers); Error por incomptabilidad de datos
        var countries = new HashSet<String>();
        countries.add("Mexico");
        countries.add("Brasil");
        countries.add("Alemania");
        countries.add("Gabs");

        names.addAll(countries);
        System.out.println(names);

            //names.removeAll(countries);
        System.out.println(countries);
        System.out.println(names);

        names.retainAll(countries);
        System.out.println(names);
        
    }
}
