package Chap18.ex2;

public class EqualsExam {
    public static void main(String[] args) {
        Member obj1 = new Member("홍길동");
        Member obj2 = new Member("박준희");
        Member obj3 = new Member("홍길동");

        if(obj1 == obj3){
            System.out.println("obj1과 obj3은 동등합니다");
        } else{
            System.out.println("obj1과 obj3은 동등하지 않습니다.");
        }
        if(obj1.equals(obj2)){
            System.out.println("obj1과 obj2는 동등합니다");
        }else{
            System.out.println("obj1과 obj2는 동등하지 않습니다");
        }
        if(obj1.equals(obj3)){
            System.out.println("obj1과 obj3는 동등합니다");
        }else{
            System.out.println("obj1과 obj3은 동등하지 않습니다.");
        }
    }
}
