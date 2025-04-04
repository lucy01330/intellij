package kr.co.javaex.ex06;

public class Car {
    public int speed; //필드 선언

    public void speedup(){
        speed += 1; //메서드 선언
    }

    public final void stop(){
        System.out.println("차를 멈춤");
        speed = 0; //final 메서드 선언
    }
}
