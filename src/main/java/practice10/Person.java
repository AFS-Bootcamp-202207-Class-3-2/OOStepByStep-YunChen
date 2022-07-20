package practice10;


import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Setter
@Getter
public class Person {
    private int id;
    private String name;
    private int age;
    /**
     * Lombok needs a default constructor in the base class
     */
    public Person() { }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person(int id,String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id &&
                age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age);
    }

    public String introduce() {
        return String.format("My name is %s. I am %d years old.",this.name,this.age);
    }
}
