package practice07;


import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.commons.lang.StringUtils;

@Data
@EqualsAndHashCode(callSuper=false)
public class Teacher extends Person {
    private Klass klass;
    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }
    public Teacher(String name, int age) {
        super(name, age);
    }
    public Teacher(int id,String name, int age) {
        super(id,name, age);
    }
    public Teacher(int id,String name, int age, Klass klass) {
        super(id,name, age);
        this.klass = klass;
    }

    @Override
    public String introduce() {
        return this.getKlass()!=null ?
                String.format("My name is %s. I am %d years old. I am a Teacher. I teach Class %d.",
                        this.getName(),
                        this.getAge(),
                        this.getKlass().getNumber()):
                String.format("My name is %s. I am %d years old. I am a Teacher. I teach No Class.",
                        this.getName(),
                        this.getAge());
    }

    public String introduceWith(Student student) {
        return this.getKlass().getNumber() == student.getKlass().getNumber()?
                String.format("My name is %s. I am %d years old. I am a Teacher. I teach %s.",
                        this.getName(),
                        this.getAge(),
                        student.getName()):
                String.format("My name is %s. I am %d years old. I am a Teacher. I don't teach %s.",
                        this.getName(),
                        this.getAge(),
                        student.getName());
    }

}
