package Chap17;

public class Mazingalmpl implements Missile, ArmLeg{
    Mazingalmpl() {
        methodToy();
        methodMissile();
        methodArmLeg();
    }

    @Override
    public void methodToy() {
        System.out.println("마징가 입니다.");
    }

    @Override
    public void methodMissile() {
        System.out.println("미사일 발사 가능합니다.");
    }
    @Override
    public void methodArmLeg() {
        System.out.println("팔다리를 움직일 수 있습니다.");
    }
}
