//package kr.co.javaex.ex05;
//
//import java.util.Scanner;
//
//public class BankApplication {
//
//    private static Account[] accounts = new Account[100];
//    private static int accountCount = 0;
//    private static Scanner sc = new Scanner(System.in);
//
//    public static void main(String[] args) {
//
//        boolean run = true;
//
//        while (run) {
//            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
//            System.out.println("선택>");
//            int choice = Integer.parseInt(sc.nextLine());
//
//            switch (choice) {
//                case 1:
//                    System.out.println("계좌생성");
//                    System.out.println("계좌번호 :");
//                    String accountNum = sc.nextLine();
//                    System.out.println("계좌주:");
//                    String Name = sc.nextLine();
//                    System.out.println("초기금액:");
//                    String balance = sc.nextLine();
//
//                    accounts[accountCount] = new Account(accountNum, Name, balance);
//                    accountCount++;
//
//                    System.out.println("계좌가 생성 되었습니다.");
//
//                    break;
//
//                case 2:
//                    for(Account s : accounts){
//                        if(s == null)
//                            continue;
//
//                        System.out.println(s.getAccountNum());
//                        System.out.println(s.getName());
//                        System.out.println(s.getBalance());
//                    }
//
//                    break;
//
//                case 3:
//                    for(Account s : accounts){
//                        if(s == null)
//                            continue;
//                        System.out.println("예금");
//                        System.out.println("계좌번호 :" + s.getAccountNum());
//                        System.out.println("예금액:");
//                        String draw = sc.nextLine();
//
//                    }
//
//                    break;
//
//                case 4:
//                    for(Account s : accounts){
//                        if(s == null)
//                            continue;
//                    System.out.println("출금");
//                    System.out.println("계좌번호:" + s.getAccountNum());
//                    System.out.println("출금액");
//                    String withdraw = sc.nextLine();
//                    }
//                    break;
//
//                case 5:
//                    run = false;
//                    break;
//            }
//
//        }
//
//    }
//}