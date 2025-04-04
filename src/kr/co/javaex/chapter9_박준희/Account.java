package kr.co.javaex.ex05;

public class Account {
    private String accountNum;
    private String Name;
    private String balance;

    public Account(String accountNum, String name, String balance) {
        this.accountNum = accountNum;
        this.Name = name;
        this.balance = balance;
    }
    public String getAccountNum() {
        return accountNum;
    }
    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getBalance() {
        return balance;
    }
    public void setBalance(String balance) {
        this.balance = balance;
    }
}
