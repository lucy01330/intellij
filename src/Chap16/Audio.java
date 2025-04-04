package Chap16;

public class Audio implements RemoteControl {
    @Override
    public void turnOn() {
        System.out.println("Audio를 켭니다.");
    }
    @Override
    public void turnOff() {
        System.out.println("AUdio를 끕니다.");
    }
//    @Override
//    public void setVolume(int volume) {
//        if (volume <= MIN_VOLUME)
//        {System.out.println("현재 Audio 볼륨:" + MIN_VOLUME);}
//        else if(volume >= MAX_VOLUME)
//        {
//            System.out.println("현재 Audio 볼륨:" + MAX_VOLUME);
//        }
//        else{
//            System.out.println("현재 Audio 볼륨:" + volume);
//        }
//    }
}
