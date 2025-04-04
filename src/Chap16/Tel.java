package Chap16;

public class Tel {
    public static void main(String[] args) {
        SmartTelevision smt = new SmartTelevision();
//        smt.search("http://www.google.com");

        RemoteControl rc = smt;
        rc.turnOff();
        rc.turnOn();

        Searchable searcher = smt;
        searcher.search("http://www.google.com");
    }
}
