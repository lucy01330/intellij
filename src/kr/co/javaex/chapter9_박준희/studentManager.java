package kr.co.javaex.ex05;

import java.util.ArrayList;
import java.util.Scanner;



public class studentManager {
    ArrayList<Student> students = new ArrayList<>(100);
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        studentManager m = new studentManager();
        boolean st = true;

        while(st){
            System.out.println("1.학생 추가 | 2. 학생 목록 | 3. 학생 수정 | 4. 학생 삭제 | 5.종료");
            System.out.println(">선택");
            int choice = Integer.parseInt(m.sc.nextLine());

            if (choice == 1) {
                System.out.println("학생 추가");


                System.out.println("학번 (key):");
                int newKey = Integer.parseInt(m.sc.nextLine());

                System.out.println("이름 :");
                String newName = m.sc.nextLine();

                System.out.println("나이 :");
                String newAge = m.sc.nextLine();

                System.out.println("전공 :");
                String newMajor = m.sc.nextLine();

//                System.out.println("학번 (key):");
//                String keys = m.sc.nextLine();
//
//                System.out.println("이름 :");
//                String name = m.sc.nextLine();
//
//                System.out.println("나이 :");
//                String age = m.sc.nextLine();
//
//                System.out.println("전공 :");
//                String major = m.sc.nextLine();

                Student s = new Student(String.valueOf(newKey), newName, newAge, newMajor);
                m.students.add(s);

                System.out.println("학번(key) :" + newKey);
                System.out.println("이름 :" + newName);
                System.out.println("나이 :" + newAge);
                System.out.println("전공 :" + newMajor);
                System.out.println("학생을 추가하였습니다.");

            }else if(choice == 2){
                for(Student s : m.students){
                    System.out.println(s.getKey());
                    System.out.println(s.getName());
                    System.out.println(s.getAge());
                    System.out.println(s.getMajor());
                }

            } else if(choice == 3){
                System.out.println("학번 (key):");
                String targetkey = m.sc.nextLine();
                boolean found = false;

                for(Student s : m.students){
                    if(s.getKey().equals(targetkey)){
                        found = true;

                        System.out.println("학번 (key):");
                        String newKey = m.sc.nextLine();
                        s.setKey(newKey);

                        System.out.println("이름 :");
                        String newName = m.sc.nextLine();
                        s.setName(newName);

                        System.out.println("나이 :");
                        String newAge = m.sc.nextLine();
                        s.setAge(newAge);

                        System.out.println("전공 :");
                        String newMajor = m.sc.nextLine();
                        s.setMajor(newMajor);
                        System.out.println("학생을 수정하였습니다.");
                    }
                }

            } else if(choice == 4){
                System.out.println("학번 (key):");
                String targetkey = m.sc.nextLine();

                boolean removed = m.students.removeIf(s -> s.getKey().equals(targetkey));

                if(removed){
                    System.out.println("학생을 삭제하였습니다.");
                }



            }else if(choice == 5){
                st = false;
            }


        }

    }
}
