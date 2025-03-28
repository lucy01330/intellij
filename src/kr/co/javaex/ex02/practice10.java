package kr.co.javaex.ex02;

public class practice10 {
    public static void main(String[] args) {
        while(true) {
            int num = (int) (Math.random() * 6)+1;
            int num2 = (int) (Math.random() * 6)+1;
            int sum = num + num2;
            System.out.println("(" + num + "," + num2 + ")" );
            if (sum == 5) {
                break;
            }




        }
    }
}
