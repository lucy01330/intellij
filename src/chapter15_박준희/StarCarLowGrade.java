package chapter15;

public class StarCarLowGrade extends StarCar {
    private int tax;
    public void setTax(int tax) {
        this.tax = tax;
    }
    //부모 클래스 생성자 호출
    public StarCarLowGrade() {
        this.color = CarSpecs.COLOR_BLUE;
        this.tire = CarSpecs.TIRE_NORM;
        this.displacement = CarSpecs.DIS_LOW;
        this.handle = CarSpecs.HANDLE_NORM;
        getSpec();
    }

    //getSpec () 메서드 오버라이딩
    public void getSpec() {

        if (this.displacement > 2000) {
            setTax(2000);
        } else {
            setTax(1000);
        }

        System.out.println("[StarCar 저사양 옵션 및 세금]");
        System.out.println("---------------------------");
        System.out.println("색상: " + color);
        System.out.println("타이어: " + tire);
        System.out.println("배기량: " + displacement);
        System.out.println("핸들: " + handle);
        System.out.println("세금: " + tax);

    }
}
