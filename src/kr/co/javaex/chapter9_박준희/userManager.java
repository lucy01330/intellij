//package kr.co.javaex.ex05;
//
//import java.util.Scanner;
//import java.util.ArrayList;
//
//public class userManager {
//    ArrayList<Member> members = new ArrayList<>(100);
//    Scanner sc = new Scanner(System.in);
//    String loggedInUser = null;
//    public static void main(String[] args) {
//        userManager u = new userManager();
//        boolean um = true;
//
//        while(um){
//            System.out.println("===== 회원관리 및 로그인 프로그램 =====");
//            System.out.println("1. 회원 추가");
//            System.out.println("2. 회원 삭제");
//            System.out.println("3. 회원 조회");
//            System.out.println("4. 로그인");
//            System.out.println("5. 로그아웃");
//            System.out.println("6. 종료");
//            System.out.println("메뉴를 선택하세요");
//            int choice = Integer.parseInt(u.sc.nextLine());
//
//            switch (choice) {
//                case 1:
//                    System.out.println("회원 추가");
//                    System.out.println("ID : ");
//                    System.out.println("영문자,숫자 사용 가능, 5~15자리");
//                    String id = u.sc.nextLine();
//                    System.out.println("password : ");
//                    System.out.println("영문자(대소문자 1 이상 포함) + 숫자(1 이상 포함).5~1자리");
//                    String password = u.sc.nextLine();
//                    System.out.println("name : ");
//                    String name = u.sc.nextLine();
//                    System.out.println("email : ");
//                    String email = u.sc.nextLine();
//                    System.out.println("tel : ");
//                    String tel = u.sc.nextLine();
//
//                    Member s = new Member(id, password, name, email, tel);
//                    u.members.add(s);
//
//                    System.out.println(" ID : " + s.getId());
//                    System.out.println("password : " + s.getPassword());
//                    System.out.println("name : " + s.getName());
//                    System.out.println("email : " + s.getEmail());
//                    System.out.println("tel : " + s.getTel());
//
//                case 2:
//                    System.out.println("학번 (key):");
//                    String targetId = u.sc.nextLine();
//
//                    boolean removed = u.members.removeIf(member -> member.getId().equals(targetId));
//
//
//                    if(removed){
//                        System.out.println("회원을 삭제하였습니다.");
//                    }
//
//                case 3:
//                    for(Member m : u.members){
//                        System.out.println(" ID : " + s.getId());
//                        System.out.println("password : " + s.getPassword());
//                        System.out.println("name : " + s.getName());
//                        System.out.println("email : " + s.getEmail());
//                        System.out.println("tel : " + s.getTel());
//                    }
//
//                case 4:
//                    System.out.println("로그인");
//                    System.out.println(" ID :");
//                    String loginId = u.sc.nextLine();
//                    System.out.println("password : ");
//                    String loginPassword = u.sc.nextLine();
//
//                    boolean loginSuccess = false;
//
//                    for(Member m : u.members){
//                        if(m.getId().equals(loginId) && m.getPassword().equals(loginPassword)){
//                            loginSuccess = true;
//                            break;
//                        }
//                    }
//                    if(loginSuccess){
//                        System.out.println("로그인 성공");
//                    }
//
//
//                case 5:
//                    if(u.loggedInUser == null){
//                        System.out.println("로그아웃 되었습니다.");
//                    }
//
//                case 6:
//                    System.out.println("프로그램 종료");
//                    um = false;
//                    break;
//
//            }
//        }
//
//    }
//}
