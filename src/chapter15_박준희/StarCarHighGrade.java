package chapter15;

public class StarCarHighGrade extends StarCar {
    private int tax;
    public void setTax(int tax) {
        this.tax = tax;
    }
    public StarCarHighGrade() {
       this.color = CarSpecs.COLOR_RED;
       this.tire = CarSpecs.TIRE_WIDE;
       this.displacement = CarSpecs.DIS_HIGH;
       this.handle = CarSpecs.HANDLE_POWER;
       getSpec();
    }
    public void getSpec(){
        if (this.displacement > 2000) {
            setTax(2000);
        }
        else {
            setTax(1000);
        }

        System.out.println("[StarCar 고사양 옵션 및 세금]");
        System.out.println("---------------------------");
        System.out.println("색상: " + color);
        System.out.println("타이어: " + tire);
        System.out.println("배기량: " + displacement);
        System.out.println("핸들: " + handle);
        System.out.println("세금:" + tax);
    }
}
