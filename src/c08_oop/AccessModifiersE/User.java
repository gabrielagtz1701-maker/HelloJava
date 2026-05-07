package c08_oop.AccessModifiersE;

public class User {

    // Atributos
    private String username;
    private String password;

    // Constructores
    public User (String username, String password) {
        this.username = username;
        this.password = password;
        System.out.println(String.format("Username y password creados con exito."));
    }

    // Métodos
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean checkPassword(String inputPassword) {
        if (password != null && password.equals(inputPassword)) {
            System.out.println("Password correcta");;
            return true;
        } else {
            System.out.println("Password incorrecto");
            return false;
        }
    }

}
