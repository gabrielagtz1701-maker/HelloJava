package c05_structures;

public class Arrays {
    // Estructuras de datos que almacenan multiples valores DEL MISMO TIPO indexados a nivel de secuencia
    // Su longitud viene dada por el numero de huecos reservados
    // No existe la eliminacion solo una especie de limpieza

    public static void main(String[] args) {

        //Declaracion y creacion
        int[] numbers = new int[3]; //Array de enetros, o listado de enteros
        System.out.println(numbers);

        String[] names = {"Gabriela", "Gutierrez", "GABS"};
        System.out.println(names);

        // Acceso
        System.out.print(numbers[0]);
        System.out.println(names[0]);

        System.out.println((new String[3])[0]); //Completo

        //Modificaci[on
        numbers[0] = 1;
        numbers[1] = 10;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

        //numbers[3] = 2; Error porque no existe ese indice, en orden

        System.out.println(names[2]);
        names[2] = "correo@correo.com";
        System.out.println(names[2]);

        // Limpieza
        System.out.println(names.length);
        names[2] = null;
        System.out.println(names[2]);
        System.out.println(names.length);

        // numbers[2] = null; Error

        boolean[] booleans = new boolean[5];
        System.out.println(booleans[4]);
    }

}