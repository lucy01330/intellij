package kr.co.javaex.ex06;

public class SmartPhone extends Phone{
//자식 생성자 선언
        public SmartPhone(String model, String color){
            super(model, color); //매개 값을 가진 생성자가 직접 호출

            System.out.println("SmartPhone (String mode, String color) 생성자 실행");
        }
    }

