package Chap18;

public class WrapperEx {
    public static void main(String[] args) {
        int iVal1 =49;
        Integer obj1 = iVal1;
        System.out.println("값:"+ obj1.intValue());

        int value = obj1; 
        System.out.println("값:"+ value);

        int result = obj1 + iVal1;
        System.out.println("값:"+ result);
    }
}
