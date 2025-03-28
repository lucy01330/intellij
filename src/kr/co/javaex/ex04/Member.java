package kr.co.javaex.ex04;

public class Member {

    //필드값 선언
    private String name;
    private String id;
    private String password;
    private int age;
    private String telno;
    private String address;

    // 메서드 형성 - Get,Set 세팅하기
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }

    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String getTelno(){
        return telno;
    }
    public void setTelno(String telno){
        this.telno = telno;
    }

    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }




    //매개변수 활용하여 생성자 선언
    public Member  (String name, String id){
        this.name = name;
        this.id = id;
    }

    boolean login (String id, String password){
        if(id.equals("hong") && password.equals("12345")){
            return true;
        }
        return false;
    }
    void logout (String id){
        System.out.println( id + "님이 로그아웃 되었습니다.");
    }


    public static void main(String[] args) {
        Member user1 = new Member("홍길동","hong");
        user1.setPassword("12345");

        Member user2 = new Member("jong","oooo");
        user2.setPassword("12345");

        if (user1.login(user1.getId(),user1.getPassword()))
            System.out.println(user1.getId() + " 로그인이 되었습니다.");

        if (!user2.login(user2.getId(),user2.getPassword()))
            System.out.println(user2.getId() + "로그인 실패");

        user1.logout(user1.getId());
        user2.logout(user2.getId());
    }



}
