package kr.co.javaex.ex06;

public class SnowTireEx {
    public static void main(String[] args) {
        SnowTire snowTire = new SnowTire();
        Tire tire = snowTire;

        snowTire.roll();
        tire.roll();
    }
}
