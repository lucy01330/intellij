package kr.co.javaex.ex02;

import java.util.Scanner;

public class practice12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("[메뉴] 1:검색, 2:등록, 3:삭제, 4:변경 > ");
        int menuNo = sc.nextInt();
        switch (menuNo) {
            case 1:
                System.out.println("검색합니다.");
                break ;
            case 2:
                System.out.println("등록합니다");
                break ;
            case 3:
                System.out.println("삭제합니다.");
                break ;
            case 4:
                System.out.println("변경합니다.");
                break ;
            default:
                break;
        }
    }
}
