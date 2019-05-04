package production.mystore;

public class PasswordException extends Exception {
    public PasswordException() {
    }

    public PasswordException(String message) {
        super(message);
    }
}
