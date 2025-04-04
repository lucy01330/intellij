package Chap19.examples;

//아이디 존재하지 않을 때 발생하는 예외

//Exception 클래스(자바에 있음) 상속 받아서 사용자 정의 예외 만들었음
public class NotExistIDException extends Exception {
    // 예외 발생 시 메시지 전달할 수 있도록 생성자 만들었음
    public NotExistIDException(String message) {
        //아래 super(message); 호출시 부모 클래스 exception의 생성자가 실행되어서 예외 메시지가 저장됨
        super(message);
    }
}
