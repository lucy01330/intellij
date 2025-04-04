package kr.co.javaex.ex06;

public class SmartPhoneExam {
    public static void main(String[] args) {
//SmartPhone 객체 생성
        SmartPhone MyPhone = new SmartPhone("갤럭시 S23", "검정색");

        System.out.println("모델:" + MyPhone.model);
        System.out.println("색상:" + MyPhone.color);
    }
}
