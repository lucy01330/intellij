package Chap19;

public class InsufficientException extends Exception {
    public InsufficientException() {
    }
    public InsufficientException(String message) {
        super(message);
    }
}
