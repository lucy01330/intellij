package chapter15;

public abstract class StarCar {
    //각 필드 추가
    protected String color;
    protected String tire;
    protected int displacement;
    protected String handle;

    // 추상 메서드 - 하위 클래스에서 반드시 구현
    abstract void getSpec();
}
