package c09_exceptions.ExceptionE;

public class LoginFailedException extends Exception {
    public LoginFailedException(String message) {
        super(message);
    }
}
