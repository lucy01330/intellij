package kr.co.javaex.ex03;

public class KiaCar {
    String company = "기아자동차";
    String model;
    String color;
    int speed;


    KiaCar() {
       this.speed = 50;

    }

    KiaCar ( String model) {
        this.model = model;
        this.speed = 50;
    }
}
