package practice06;


import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Objects;

@Data
public class Klass {
    private int number;

    public Klass(int klass) {
        number = klass;
    }

    public String getDisplayName() {
        return String.format("Class %d",number);
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
}
