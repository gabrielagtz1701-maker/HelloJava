public class DataTypes {

    public static void main(String[] args) {

        // Tipos de datos primitivos

        int myInt = 27; // Representa números enteros sin decimales
        System.out.println(myInt);

        double myDouble = 1.65; // Representa números decimales
        System.out.println(myDouble);
        // float, long. byte  son otros tipos de datos

        char myChar = 'a'; // Un solo caracter se pone con comillas simples
        System.out.println(myChar);

        boolean myBoolean = true; // Valores lógicos verdadeos o falsos
        myBoolean = false;
        System.out.println(myBoolean);

        String myString = "Hola, Java!"; // Es una clase pero es una especie de dato primitivo
        System.out.println(myString);

        // Tipo de dato en tiempo de compilación, esto aplica solo para clases

        System.out.println(myString.getClass().getSimpleName());
    }
}
