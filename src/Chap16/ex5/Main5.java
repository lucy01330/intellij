package Chap16.ex5;

public class Main5 {
    public static void main(String[] args) {

        Car myCar = new Car();

        myCar.tire = new HankookTire();
        myCar.run();

        myCar.tire = new NexenTire();
        myCar.run();
    }

}
