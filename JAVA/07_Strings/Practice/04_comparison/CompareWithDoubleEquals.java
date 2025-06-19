//Compare two string literals using `==` and explain the result.
public class CompareWithDoubleEquals {

    public static void main(String[] args) {

        // Both strings are string literals stored in the String Pool
        String a = "Ram";
        String b = "Ram";

        // Compares references (memory addresses)
        // Since both refer to the same string in the String Pool, this returns true
        System.out.println(a == b);  // Output: true

        // These are two separate String objects in the heap
        String name3 = new String("ravi");
        String name4 = new String("ravi");

        // Even though the content is the same, the objects are different
        System.out.println(name3 == name4);  // Output: false
    }
}
