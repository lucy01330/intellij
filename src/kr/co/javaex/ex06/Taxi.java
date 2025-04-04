package kr.co.javaex.ex06;

public class Taxi extends Vehicle {
    //메서드 오버라이딩
    @Override
    void run() {
        System.out.println("택시가 달립니다.");
    }
}
