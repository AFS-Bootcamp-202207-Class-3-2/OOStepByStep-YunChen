package practice05;


import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class Teacher extends Student {
    public Teacher(String name, int age,int klass) {
        super(name, age,klass);
    }
    public Teacher(String name, int age) {
        super(name, age);
    }

    @Override
    public String introduce() {
        return this.getKlass()!=0?
                String.format("My name is %s. I am %d years old. I am a Teacher. I teach Class %d.",
                        this.getName(),
                        this.getAge(),
                        this.getKlass()):
                String.format("My name is %s. I am %d years old. I am a Teacher. I teach No Class.",
                        this.getName(),
                        this.getAge());
    }
}
