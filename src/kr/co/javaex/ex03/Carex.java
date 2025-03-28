package kr.co.javaex.ex03;

public class Carex {
    public static void main(String[] args) {

        KiaCar myCar1 = new KiaCar("쏘렌토");
        System.out.println("모델명 :" + myCar1.model);

        KiaCar myCar2 = new KiaCar();
        System.out.println("모델명 :" + myCar2.model);


    }
}
