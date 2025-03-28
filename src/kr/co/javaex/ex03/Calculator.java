package kr.co.javaex.ex03;

import org.w3c.dom.ls.LSOutput;

import java.util.concurrent.LinkedTransferQueue;

public class Calculator {
    String strCalc = "원의 면적:";

    static double PI = 3.14159;

    static double calc(double radius) {
        double area = radius * radius * PI;

        return area;
    }
    static int plus(int x, int y){
        return x + y;
    }
    static int minus(int x, int y){
        return x - y;
    }
//    int sum = Calculator.plus(int x, int y);
//    int sub = Calculator.minus(int x, int y);


}

