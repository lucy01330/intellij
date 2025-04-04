package kr.co.javaex.ex06;
//필드 선언
public class Phone {
    public String model;
    public String color;
//매개변수 가지고 있는 생성자 선언
    public Phone(String model, String color){
        this.model = model;
        this.color = color;

        System.out.println("Phone(String model, String color) 생성자 실행");
    }
}

