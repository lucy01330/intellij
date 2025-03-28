package kr.co.javaex.ex02;

public class practice13 {
    public static void main(String[] args) {
        String name1 = "홍길동";
        String name2 = "홍길동";
        String name3 = new String("홍길동");

        System.out.println(name1==name2);
        System.out.println(name1==name3);
    }
}
