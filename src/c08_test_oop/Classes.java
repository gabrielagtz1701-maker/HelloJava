package c08_test_oop;

import c08_oop.Person;

public class Classes {
    // Clases
    /*
    Dentro se definen los objetos y sus carateísticas
    Se espera que la clase sea el fichero contenedor

    Forma de crear
    Modificador/palabra reservada class/nombre de la clase

    Se pueden almacenar atributos y comportamientos (métodos o funciones)
    Comienzan en mayusculas

    Atributos - Variables que definene el estado y las características del objeto
    Método - Funciones que definen el comportamiento del objeto
    Objeto - Instancia que tiene esos atibutos y que utilizan esos métodos
    Contructor - Permite inicializar el objeto con valores desde su creación

    Orden de creación:
    - Atributos
    - Constructores
    - Métodos
     */

    public static void main(String[] args) {

        // Llamar a una clase
        var person = new Person("Gabriela", 28, "001");

        //person.name = "Gabriela";
        //person.age = 28;

        person.sayHello();

        //person.name = "Gabriela1_1";
        //System.out.println(person.name);

    }
}
