package kr.co.javaex.ex05;

public class Student {
    private String key;
    private String name;
    private String age;
    private String major;

    Student(String key, String name, String age, String major){
        this.key = key;
        this.name = name;
        this.age = age;
        this.major = major;
    }

    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }

    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }
}
