package practice06;


import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class Klass {
    private int number;

    public Klass(int klass) {
        number = klass;
    }

    public String getDisplayName() {
        return String.format("Class %d",number);
    }
}
