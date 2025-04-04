package Chap19;

import java.io.FileWriter;
import java.io.IOException;

public class ExceptionExam1 {
    public static void main(String[] args) {
        try{
            FileWriter fw = new FileWriter("data.txt");
            fw.write("나의 이름은 홍길동");
        }catch (IOException e){
            System.out.println("오류가 발생하였습니다.");
        }
//        fw.close(); // try-catch 이후에 close하면 오류 !
    }
}
