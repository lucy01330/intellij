package Chap16;

public interface RemoteControl {

    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    public abstract void turnOn();
    public abstract void turnOff();
    //abstract void setVolume(int volume);

}
