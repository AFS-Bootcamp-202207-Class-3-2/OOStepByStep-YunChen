package practice05;


import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class Teacher extends Person {
    private Integer klass = null;
    public Teacher(String name, int age,int klass) {
        super(name, age);
        this.klass = klass;
    }
    public Teacher(String name, int age) {
        super(name, age);
    }

    @Override
    public String introduce() {
        return this.getKlass() != null ?
                super.introduce() + String.format(" I am a Teacher. I teach Class %d.",
                        this.getKlass()) :
                super.introduce() + " I am a Teacher. I teach No Class.";
    }
}
