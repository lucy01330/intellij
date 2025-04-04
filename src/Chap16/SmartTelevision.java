package Chap16;

public class SmartTelevision implements Searchable, RemoteControl {

    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다.");
    }
    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다.");
    }
    @Override
    public void search(String url) {
        System.out.println("검색합니다.");
    }
}
