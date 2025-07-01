// Demonstrates overriding equals() and hashCode()

import java.util.Objects;

public class EqualsAndHashCodeExample {
    int id;
    String name;

    EqualsAndHashCodeExample(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Override equals to compare values
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EqualsAndHashCodeExample)) return false;
        EqualsAndHashCodeExample that = (EqualsAndHashCodeExample) o;
        return id == that.id && name.equals(that.name);
    }

    // Override hashCode for hashing logic (used in HashMap, etc.)
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public static void main(String[] args) {
        EqualsAndHashCodeExample obj1 = new EqualsAndHashCodeExample(1, "Ravi");
        EqualsAndHashCodeExample obj2 = new EqualsAndHashCodeExample(1, "Ravi");

        System.out.println(obj1.equals(obj2)); // true
        System.out.println(obj1.hashCode() == obj2.hashCode()); // true
    }
}

