package kr.co.javaex.ex02;

public class practice5 {
    public static void main(String[] args) {
        int score = 91;
        if (score >= 90) {
            System.out.println("점수가 90보다 큽니다.");
        }
        if (score < 90) {
            System.out.println("점수가 90보다 작습니다.");
        }
        if (score >= 90) {
            System.out.println("점수가 90보다 큽니다.");
        } else {
            System.out.println("점수가 90보다 작습니다");
        }

        if (score >= 90) {
            System.out.println("점수가 100-90입니다.");
        } else if(score >= 90) {
            System.out.println("점수가 90-80입니다.");
        }else{
            System.out.println("점수가 80미만입니다.");
        }



    }

}
