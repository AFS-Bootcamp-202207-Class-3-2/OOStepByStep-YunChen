package practice08;


import lombok.Data;
import lombok.EqualsAndHashCode;
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
        return this.getKlass() != null ?
                super.introduce() + String.format(" I am a Teacher. I teach Class %d.",
                        this.getKlass().getNumber()) :
                super.introduce() + " I am a Teacher. I teach No Class.";
    }

    public String introduceWith(Student student) {
        return this.getKlass().equals(student.getKlass()) ?
                super.introduce() + String.format(" I am a Teacher. I teach %s.",
                        student.getName()) :
                super.introduce() + String.format(" I am a Teacher. I don't teach %s.",
                        student.getName());
    }

}
