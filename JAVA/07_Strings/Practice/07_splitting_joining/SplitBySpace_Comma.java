//Split a sentence into words using .split(" ").
//Split a CSV string into fields using .split(",").

public class SplitBySpace_Comma {
    public static void main(String[] args) {

        String name = "Ram Shyam Hari";
        String name2 = "Ram,Shyam,Hari";

        // Split the string by space
        String[] spt = name.split(" ");
        String[] spt2 = name2.split(",");

        // Print each word from space-split array
        System.out.println(spt[0]);  // Output: Ram
        System.out.println(spt[1]);  // Output: Shyam
        System.out.println(spt[2]);  // Output: Hari

        // Print each field from comma-split array
        System.out.println(spt2[0]);  // Output: Ram
        System.out.println(spt2[1]);  // Output: Shyam
        System.out.println(spt2[2]);  // Output: Hari
    }
}
