package Chap19;

public class Person {
    int age;

    public void setAge(int age) throws InsufficientException {
        try {
            if (age < 0) {
                throw new IllegalArgumentException("나이:" + age + ",[오류 메시지: 나이는 음수가 될 수 없습니다.]");
            }

            this.age = age;
        } catch (IllegalArgumentException e) {
            System.out.println("오류 발생:" + e.getMessage());
        }
    }
}
