package kr.co.javaex.ex06;

public class Supersonic extends Airplane {

    public static final int NORMAL = 1;
    public static final int SUPERSONIC = 2;

    public int flyMode = NORMAL;

    public Supersonic() {
        super();

    }
    public void fly(){
        if (flyMode == SUPERSONIC) {
            System.out.println("초음속 비행합니다");
        } else {
            super.norm();
        }
    }
    public static void main(String[] args) {
        Supersonic s = new Supersonic();

        s.flight();
        s.norm();

        s.flyMode = Supersonic.NORMAL;
        s.norm();

        s.flyMode = Supersonic.SUPERSONIC;
        s.norm();

        s.land();
    }
}

