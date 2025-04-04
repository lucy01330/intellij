package Chap19;

public class ExceptionThrowExam1 {
    public static void main(String[] args) {
        Person person = new Person();
        try{
        person.setAge(-30);
    } catch(InsufficientException e) {
            System.out.println("전달 받은 메세지: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
