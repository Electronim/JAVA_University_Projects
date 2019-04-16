package tasks.exception;

public class UserAuthException extends Exception {
    public UserAuthException() {
        super();
    }

    public UserAuthException(Exception e) {
        super(e);
    }

    public UserAuthException(String msg) {
        super(msg);
    }
}
