package Chap18;

public class Account {
    //멤버 변수 필드
    private String accountNumber;
    private int balance;
    //생성자
    public Account(String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    //toString() 오버라이딩 -> 원하는 출력 형식 설정
    @Override
    public String toString() {
        return balance + "원(계좌번호=)" + accountNumber;
    }
    public static void main(String[] args) {
        //계좌 생성
        Account a = new Account("4696", 1592);
                System.out.println(a);
    }
}
