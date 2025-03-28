package kr.co.javaex.ex02;

public class practice8 {
    public static void main(String[] args) {
        int sum = 0;
        int sum2 = 0;

        for( int i = 1; i <= 100; i++ ) {
            if( i % 2 == 0 ) {
                sum += i;
            }
            else{ sum2 += i; }

        }
        System.out.println(sum + "입니다");
        System.out.println(sum2 + "입니다");
    }
}
