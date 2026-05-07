package c08_oop.AccessModifiersE;

public class Book {

    // Atributos
    private String title;

    // Constructor
    public Book(String title) {
        this.title = title;
        System.out.println("Nuevo book: " + title);
    }

    // Métodos
    public String getTitle() {
        return title;
    }
}
