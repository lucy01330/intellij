package kr.co.javaex.ex03;

import java.util.Scanner;

public class pr6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("메뉴는 아래와 같습니다. " +
                "1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
        int value = Integer.parseInt(sc.nextLine());
        int[] counts = null;
        int total = 0;
        int max = 0;
        while (value != 5) {
            switch (value) {
                case 1:
                    System.out.println("학생수를 최소 10명 이상 입력하세요.");
                    int count = Integer.parseInt(sc.nextLine());
                    counts = new int[count];
                    break;
                case 2:
                    System.out.println("학생수만큼 점수를 입력해주세요.");
                    for (int i = 0; i < counts.length; i++) {
                        counts[i] = Integer.parseInt(sc.nextLine());
                        total += counts[i];
                        if (counts[i] > max) {
                            max = counts[i];
                        }
                    }break;
                    case 3:
                        System.out.println("점수리스트를 출력합니다.");
                        for (int i = 0; i < counts.length; i++) {
                            System.out.println(counts[i]);
                        }break;
                        case 4:
                            System.out.println("분석결과를 출력합니다.");
                            System.out.println(max);
                            System.out.println(total/counts.length);
                            break;
                    default:
                        System.out.println("다시적으세요");
                        break ;
            }
            value = Integer.parseInt(sc.nextLine());
        }
    }


}
