public class VariablesAndConstants {

    public static void main(String[] args) {

        //Variables => tipo_dato Nombre_variable = valor;

        // Tipado de datos, tradicional
        String name =  "Gabriela";
        System.out.println(name);

        name = "Guadalupe";
        System.out.println(name);

        // name = "37"; Error (no se puede ambiar el tipo de dato)

        int age = 27;
        System.out.println(age);

        // Inferencia de tipos
        var email = "variable@hotmail.com";
        System.out.println(email);

        var year = 2025;
        System.out.println(year);

        // Constantes escritas con mayúsculas, es una buena práctica.

        final String EMAIL = "gabriela@hotmail.com";
        // email = "1701@hotmail.com"; Es constante, no puede cambiar de valor
        System.out.println(EMAIL);
    }
}
