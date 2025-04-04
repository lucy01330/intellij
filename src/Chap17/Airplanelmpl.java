package Chap17;

public class Airplanelmpl implements Missile, Light{
    Airplanelmpl() {
        methodToy();
        methodLight();
        methodMissile();
    }

    @Override
    public void methodToy() {
        System.out.println("비행기 입니다.");
    }

    @Override
    public void methodMissile() {
        System.out.println("미사일 발사가 가능합니다.");
    }
    @Override
    public void methodLight() {
        System.out.println("불빛 발사 가능합니다.");
    }
}
