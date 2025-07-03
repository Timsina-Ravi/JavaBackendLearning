// File: NestedLoopsDemo.java
// Demonstrates nested loops in Java: for, while, and do-while loops with nested inner loops

public class NestedLoopsDemo {

    public static void main(String[] args) {

        // ===== Nested For Loops =====
        System.out.println("Nested For Loops:");
        // Outer for loop runs 3 times
        for (int i = 1; i <= 3; i++) {
            System.out.println("Outer loop iteration: " + i);

            // Inner for loop runs 2 times per each outer loop iteration
            for (int j = 1; j <= 2; j++) {
                System.out.println("  Inner loop iteration: " + j);
            }
        }

        // ===== Nested While Loops =====
        System.out.println("\nNested While Loops:");
        int i = 1;  // Outer loop counter for while loop
        while (i <= 3) {
            System.out.println("Outer loop iteration: " + i);

            int j = 1;  // Inner loop counter for while loop
            while (j <= 2) {
                System.out.println("  Inner loop iteration: " + j);
                j++;
            }
            i++;
        }

        // ===== Nested Do-While Loops =====
        System.out.println("\nNested Do-While Loops:");
        i = 1;  // Reset outer loop counter for do-while loop
        do {
            System.out.println("Outer loop iteration: " + i);

            int j = 1;  // Inner loop counter for do-while loop
            do {
                System.out.println("  Inner loop iteration: " + j);
                j++;
            } while (j <= 2);

            i++;
        } while (i <= 3);
    }
}

