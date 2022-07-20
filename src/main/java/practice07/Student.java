package practice07;


import org.apache.commons.lang.StringUtils;

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

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    @Override
    public String introduce() {
        //My name is Tom. I am 21 years old. I am a Student. I am Leader of Class 2.
        return this.getKlass().getLeader()==null?
                String.format("My name is %s. I am %d years old. I am a Student. I am at %s.",
                        this.getName(),
                        this.getAge(),
                        klass.getDisplayName()):
                String.format("My name is %s. I am %d years old. I am a Student. I am Leader of %s.",
                        this.getName(),
                        this.getAge(),
                        klass.getDisplayName());
    }
}
