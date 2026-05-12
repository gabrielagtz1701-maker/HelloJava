package c10_extras;

public class User {
    // Constante de la aplicación
    public static final String APP_NAMe = "MiEjercicio9";

    // Variable global (atributo de instancia)
    private String username;

    // Constructor para inicializar username
    public User(String username){
        this.username = username;
    }

    // Método que imprime la costante y la variable global
    public void printInfo() {
        System.out.println("APP_NAME: " + APP_NAMe);
        System.out.println("Usuario: " + username);
    }
}
