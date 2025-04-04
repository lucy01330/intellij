package Chap17;

public class Poohlmpl implements ArmLeg {
    Poohlmpl() {
        methodToy();
        methodArmLeg();
    }
    @Override
    public void methodToy() {
        System.out.println("곰돌이 입니다.");
    }

    @Override
    public void methodArmLeg() {
        System.out.println("팔다리를 움직일 수 있습니다.");
    }
}
