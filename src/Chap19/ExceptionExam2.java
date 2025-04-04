package Chap19;


import java.io.FileWriter;
import java.io.IOException;

public class ExceptionExam2 {
    public static void main(String[] args) {
        FileWriter fw = null;
        try{
            fw = new FileWriter("data.txt");
            fw.write("나의 이름은 홍길동");
        } catch (IOException e) {
            System.out.println("오류가 발생하였습니다");
        } finally {
            //파일, DB접속, 네트워크 접속 등에서는 반드시 finally로 처리해야함
            try{
                fw.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
