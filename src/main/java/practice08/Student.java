package practice08;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;
@Getter
@Setter
public class Student extends Person {
    private Klass klass;
    public Student(String name, int age) {
        super(name, age);
    }
    public Student() {
    }
    public Student(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }
    public Student(int id,String name, int age, Klass klass) {
        super(id,name, age);
        this.klass = klass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return super.equals((Person) o) && Objects.equals(klass, student.klass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), klass);
    }

    @Override
    public String introduce() {
        //My name is Tom. I am 21 years old. I am a Student. I am Leader of Class 2.
        return isLeader == null ?
                super.introduce() + String.format(" I am a Student. I am at %s.",
                        klass.getDisplayName()) :
                super.introduce() + String.format(" I am a Student. I am Leader of %s.",
                        isLeader.getDisplayName());
    }

    private Klass isLeader;
}
