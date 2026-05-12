package c09_exceptions.ExceptionE;

public class LoginSystem {

    private final String userCorrect = "admin";
    private final String passwordCorrect = "123";

    public void login(String username, String password) throws LoginFailedException {
        if (!userCorrect.equals(username) || !passwordCorrect.equals(password)) {
            throw new LoginFailedException("Usuario o contraseña no válidos");
        }

        System.out.println("Inicio de sesión exitoso");
    }
}
