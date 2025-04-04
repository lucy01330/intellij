package Chap16.ex4;

public class Main4 implements C {
    @Override
    public void methodA() {
        System.out.println("InterfaceImp1 - methodA");
    }
    @Override
    public void methodB() {
        System.out.println("InterfaceImp2 - methodB");
    }
    @Override
    public void methodC() {
        System.out.println("InterfaceImp3 - methodC");
    }

    public static void main(String[] args) {
        A a = new Main4();
        a.methodA();

        B b = new Main4();
        b.methodB();

        C c = new Main4();
        c.methodA();
        c.methodB();
        c.methodC();
    }
}
