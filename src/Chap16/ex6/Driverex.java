package Chap16.ex6;

public class Driverex {
    public static void main(String[] args) {
        Driver d = new Driver();

        Bus bus = new Bus();
        d.driver(bus);

        Taxi taxi = new Taxi();
        d.driver(taxi);
    }
}
