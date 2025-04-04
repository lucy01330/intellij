package Chap19.examples;

public class loginexam {
    public static void main(String[] args) {
        String id = "batman";
        String password = "12345";

        try{
            // 존재하지 않는 ID superman 넣어서 예외 발생시킴, throw new NotExist~ 실행 시 catch로 이동해 예외 메시지 출력
            login("superman", "12345");
            // 올바른 아이디지만 비번이 틀려서 예외처리 발생
            login("batman","54321");
            //여기서 e는 객체를 담는 변수
        } catch (NotExistIDException e){
            System.out.println(e.getMessage());
        }catch (WrongPasswordException e){
            System.out.println(e.getMessage());
        }
    }

    //강제로 예외 발생시킬 때 throw 키워드 사용
    public static void login(String inputID, String inputPassword)
   // 이 메서드가 아래 두개의 exception을 발생시킨다는 의미
    throws NotExistIDException, WrongPasswordException{
        String correctID = "batman";
        String correctPassword = "12345";

        //inputID와 correctID 비교해서 만약 다르면 강제로 예외 발생 시킴
        if(!inputID.equals(correctID)){
            throw new NotExistIDException("ID가 존재하지 않습니다." + inputID);
        }
        //ID랑 똑같이 input과 correct 비교하여 비밀번호 다르면 강제로 예외 발생 기킴
        if(!inputPassword.equals(correctPassword)){
            throw new WrongPasswordException("비밀번호가 틀렸습니다."+ inputPassword);
        }
        System.out.println("로그인 성공!");
    }
}
// throw는 예외를 강제로 발생시킬때 사용하고  throws는 메서드가 예외를 던질 수 있음을 선언