public class BegginerExercises {

    public static void main (String[] args) {

        // 1. Declara una variable de tipo String y asígnale tu nombre.
        String name = "Gabriela";
        System.out.println(name);

        // 2. Crea una variable de tipo int y asígnale tu edad.
        int age = 27;
        System.out.println(age);

        // 3. Crea una variable double con tu altura en metros.
        double height = 1.65;
        System.out.println(height);

        // 4. Declara una variable de tipo boolean que indique si te gusta programar.
        boolean programar = true;
        System.out.println("¿Te gusta programar? " + programar);

        // 5. Declara una constante con tu email.
        final String EMAIL = "gabrielagtz1701@gmail.com";
        System.out.println(EMAIL);

        // 6. Crea una variable de tipo char y guárdale tu inicial.
        char inicial = 'G';
        System.out.println(inicial);

        // 7. Declara una variable de tipo String con tu localidad, y a continuación cambia su valor y vuelve a imprimirla.
        String localidad = "Tecámac";
        System.out.println("Primer intento: " + localidad);

        localidad = "Sta Cruz";
        System.out.println("Segundo intento: " + localidad);

        // 8. Crea una variable int llamada a, otra b, e imprime la suma de ambas.
        int a = 45;
        int b = 56;
        System.out.println(a + b);

        // 9. Imprime el tipo de dos variables creadas anteriormente.
        System.out.println(name.getClass().getSimpleName());
        System.out.println(localidad.getClass().getSimpleName());

        // 10. Intenta declarar una variable sin inicializarla y luego asígnale un valor antes de imprimirla.
        int nHermanos;
        nHermanos = 0;
        System.out.println(nHermanos);
    }
}
