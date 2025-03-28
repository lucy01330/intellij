package kr.co.javaex.ex02;
import java.sql.SQLOutput;
import java.util.Scanner;
public class practice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number % 3 == 0) {
            System.out.println(number + "는 3의 배수입니다.");
        }
        else {
            System.out.println(number + "는 3의 배수가 아닙니다.");

        }
    }
}
