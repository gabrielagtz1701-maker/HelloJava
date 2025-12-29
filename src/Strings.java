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

        // Comparacion
        System.out.println(name.equals("Gabriela"));
        System.out.println(name.equals("gabriela"));
        System.out.println(name.equalsIgnoreCase("GabRiela"));

        // == vs .equals
        var a = "Gabriela";
        var b = "Gabriela";
        var c = new String("Gabriela");

        System.out.println(a == b); // Hace una comparacion del propio objeto
        System.out.println(a.equals(c)); // Hace una comparacion del valor de la variable

        // Trim
        System.out.println(" Hola, me llamo Gabriela ");
        System.out.println(" Hola, me llamo Gabriela ".trim());//Quita espacios al principio y al final

        //Replace
        System.out.println(" Hola, me llamo Gabriela ".replace(" ", ""));
        System.out.println(" Hola, me llamo Gabriela ".replace("Gabriela", "Gaby"));

        // Format
        var age = 27;
        System.out.println(String.format("Hola, %s. Tengo %d anios.", name, age));
        

    }
}