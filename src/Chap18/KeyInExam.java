package Chap18;

public class KeyInExam {
    public static void main(String[] args) throws Exception {
        int keyCode = 0;
        int speed = 0;

        while(true){

            keyCode = System.in.read();

            if( keyCode == 49 || keyCode == 50) {
                continue;
            }
                if(keyCode == '1') {
                    speed++;
                    System.out.println("속도 증가: " + speed);
                }else if(keyCode == '2') {
                    if (speed > 0) {
                        speed--;
                    }
                    System.out.println("속도 감소: " + speed);
                }else if(keyCode == '3') {
                    System.out.println("프로그램을 종료합니다.");
                    break;
                }

            }
        }
    }

