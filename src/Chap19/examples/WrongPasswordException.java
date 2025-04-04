package Chap19.examples;

//비번 틀렸을때 발생하는 예외
public class WrongPasswordException extends Exception {
    public WrongPasswordException(String message) {
        super(message);
    }
}
