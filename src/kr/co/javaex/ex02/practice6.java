package kr.co.javaex.ex02;

import java.util.Scanner;

public class practice6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("국어 점수를 입력하세요.");
        int score1 = sc.nextInt();
        System.out.println("영어 점수를 입력하세요.");
        int score2 = sc.nextInt();
        System.out.println("수학 점수를 입력하세요.");
        int score3 = sc.nextInt();
        if ((score1 + score2 + score3)/3 >= 80){
            System.out.println("평균을 넘었습니다.");
        } else if ((score1 + score2 + score3)/3 < 80){
            System.out.println("평균을 넘지 못했습니다.");
        }
    }


    }
