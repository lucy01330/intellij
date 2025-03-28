package kr.co.javaex.ex03;

public class CalculatorEx {
    public static void main(String[] args) {
        System.out.println("정사각형 넓이:" + areaRectangle(100));
        System.out.println("직사각형 넓이:" + areaRectangle(100, 50));
    }
    private static double areaRectangle(double width) {
        return width * width;
    }
    private static double areaRectangle(double width, double height) {
        return width * height;
    }


}
