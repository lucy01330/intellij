package kr.co.javaex.ex06;

public class Bus extends Vehicle {
    //메서드 오버라이딩
    @Override
    void run() {
        System.out.println("버스가 달립니다.");
    }
}
