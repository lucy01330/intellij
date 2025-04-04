package Chap20;

import java.util.ArrayList;
import java.util.List;

public class ex1person {

    String name;

    ex1person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        List<ex1person> persons = new ArrayList<ex1person>();
        ex1person person1 = new ex1person("홍길동");
        ex1person person2 = new ex1person("만득이");
        persons.add(person1);
        persons.add(person2);

        for (ex1person person : persons) {
            System.out.println(person);
        }

    }

}
