package kr.co.javaex.ex04;

public class pr1 {
    private String name;
    private int speed;
    private boolean stop;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getSpeed(){
        return speed;
    }
    public void setSpeed(int speed){
        if(speed < 0) {
            this.speed = 0;
            return;
        } else this.speed = speed;
    }
    public boolean isStop() {
        return stop;
    }
    public void setStop(boolean stop) {
        this.stop = stop;
    }

    public static void main(String[] args) {
        //pr1 객체 생성
        pr1 car = new pr1();

        //이름 설정

    }
}
