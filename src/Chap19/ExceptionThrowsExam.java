package Chap19;

public class ExceptionThrowsExam {
    public static void main(String[] args) {
        try{
            findClass();
        } catch (ClassNotFoundException e) {
            System.out.println("예외 처리:" + e.getMessage());
        }
    }
    public static void findClass() throws ClassNotFoundException {
        //try-catch가 없어도 굄
        Class.forName("java.lang.String2");
    }
}
