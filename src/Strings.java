public class Strings {

    public static void main(String[] args) {

        // Cadenas de texto

        String name = "Gabriela";
        var surname = new String("Gutierrez");

        //Concatenación
        System.out.println(name + " " + surname);

        // Longitud del String
        System.out.println(name.length());

        // Obtener caracter en cierta posición
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(name.length() - 1));

        // Obtener una subcadena
        System.out.println("Gabriela\n01234567");
        System.out.println(name.substring(2));
        System.out.println(name.substring(1, 3)); // Excluye el ultimo caracter

        // Mayusculas y minusculas

        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name);

        // Comprobar si contiene
        System.out.println("Hola, Java.".contains("Gabiriela"));
        System.out.println("Hola, Java.".contains("ava"));
        System.out.println("Hola, Java.".toUpperCase().contains("AVA"));
    }
}