package practice02;

import lombok.Data;

@Data
public class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String introduce() {
        return String.format("My name is %s. I am %d years old.",this.name,this.age);
    }
}
