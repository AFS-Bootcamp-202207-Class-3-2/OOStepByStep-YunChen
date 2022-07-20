package practice06;


public class Student extends Person {
    private Klass klass;
    public Student(String name, int age) {
        super(name, age);
    }
    public Student() {
    }
    public Student(String name, int age,Klass klass) {
        super(name, age);
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
        return String.format("My name is %s. I am %d years old. I am a Student. I am at %s.",
                this.getName(),
                this.getAge(),
                klass.getDisplayName());
    }
}
