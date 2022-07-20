package practice09;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedList;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Getter
@Setter
public class Teacher extends Person {

    LinkedList<Klass> classes;
    public Teacher(String name, int age, LinkedList<Klass> classes) {
        super(name, age);
        this.classes = classes;
    }
    public Teacher(String name, int age) {
        super(name, age);
    }
    public Teacher(int id,String name, int age) {
        super(id,name, age);
    }
    public Teacher(int id,String name, int age, LinkedList<Klass> classes) {
        super(id,name, age);
        this.classes = classes;
    }

    @Override
    public String introduce() {
        return this.getClasses() != null && this.getClasses().size() != 0 ?
                super.introduce() + " I am a Teacher. I teach Class " + classes.stream().map(klass -> klass.getNumber() + "").collect(Collectors.joining(", "))+"." :
                super.introduce() + " I am a Teacher. I teach No Class.";
    }

    public String introduceWith(Student student) {
        return this.getClasses().contains(student.getKlass()) ?
                super.introduce() + String.format(" I am a Teacher. I teach %s.",
                        student.getName()) :
                super.introduce() + String.format(" I am a Teacher. I don't teach %s.",
                        student.getName());
    }

    public boolean isTeaching(Student student) {
        return this.getClasses().contains(student.getKlass());
    }
}
