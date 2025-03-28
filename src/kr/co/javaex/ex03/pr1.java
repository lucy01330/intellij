package kr.co.javaex.ex03;

public class pr1 {
    public static void main(String[] args) {
        int[] []  array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };
        int rowCount = 0;
        for (int i = 0; i < array.length; i++) {
            rowCount++;
        }
        System.out.println(rowCount);



    }
}
