package practice07;


import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class Klass {
    private int number;

    private Student leader;

    public Klass(int klass) {
        number = klass;
    }

    public String getDisplayName() {
        return String.format("Class %d", number);
    }

    public void assignLeader(Student student) {
        this.leader = student;
    }
}
