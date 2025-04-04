//package Chap19;
//
//public class ExceptionExam3 {
//    public static void main(String[] args) {
//        String[] strArr = {"100", "200"};
//
//        for (int i = 0; i < strArr.length; i++) {
//        }try{
//            int iValue = Integer.parseInt(strArr[i]);
//            System.out.println("array[" + i + "]:" + iValue);
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("배열 인덱스 초과:" + e.getMessage());
//        }catch (NumberFormatException e) {
//            System.out.println("숫자로 변환할 수 없음:" + e.getMessage());
//        }
//    }
//}
