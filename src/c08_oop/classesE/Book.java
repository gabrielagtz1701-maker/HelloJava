package c08_oop.classesE;

public class Book {

    // Atributos
    String title;
    String author;

    // Constructor
    public Book (String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Función
    public void pBook () {
        System.out.println(String.format("Nombre del libro: %s, Autor: %s",title, author));
    }


}
