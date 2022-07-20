package practice10;


import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Getter
@Setter
public class Klass {
    private int number;

    private Student leader;

    private Teacher teacher;

    Set<Student> students =new HashSet<>();
    public Klass(int klass) {
        number = klass;
    }

    public String getDisplayName() {
        return String.format("Class %d", number);
    }

    public void assignLeader(Student student) {
        if (!students.contains(student)){
            System.out.print("It is not one of us.\n");
            return;
        }
        this.leader = student;
        if (teacher != null) {
            System.out.print(String.format("I am %s. I know %s become Leader of Class %d.\n",
                    teacher.getName(),
                    student.getName(),
                    number));
        }

        student.setIsLeader(this);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Klass klass = (Klass) o;
        return number == klass.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    public void appendMember(Student student) {
        students.add(student);
        if (teacher != null) {
            System.out.print(String.format("I am %s. I know %s has joined Class %d.\n",
                    teacher.getName(),
                    student.getName(),
                    number));
        }

    }
}
