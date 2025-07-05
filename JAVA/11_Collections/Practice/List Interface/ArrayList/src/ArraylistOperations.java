import java.util.ArrayList;
import java.util.Collections;

public class ArraylistOperations {
    public static void main(String[] args) {

        // Create a list of tasks
        ArrayList<String> tasks = new ArrayList<>();

        // Add tasks to the list
        tasks.add("task1 - 03/14/2025");
        tasks.add("task2 - 05/14/2025");
        tasks.add("task3 - 04/14/2025");

        // Print the full list
        System.out.println("Initial Task List: " + tasks);

        // Get a task by index
        System.out.println("First Task: " + tasks.get(0));

        // Loop using for-each
        System.out.println("\nUsing for-each loop:");
        for (String task : tasks) {
            System.out.println(task);
        }

        // Loop using index
        System.out.println("\nUsing for loop:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println(tasks.get(i));
        }

        // Update a task
        tasks.set(0, "task1 - 06/14/2025");
        System.out.println("\nAfter update: " + tasks);

        // Check size
        System.out.println("Size: " + tasks.size());

        // Check if list contains a task
        boolean hasTask3 = tasks.contains("task3 - 04/14/2025");
        System.out.println("Contains task3? " + hasTask3);

        // Find index of a task
        int index = tasks.indexOf("task3 - 04/14/2025");
        System.out.println("Index of task3: " + index);

        // Add a task at a specific index
        tasks.add(1, "task4 - 07/01/2025");
        System.out.println("\nAfter adding task4 at index 1: " + tasks);

        // Sort tasks alphabetically
        Collections.sort(tasks);
        System.out.println("Sorted Tasks: " + tasks);

        // Clone the list
        ArrayList<String> clonedTasks = (ArrayList<String>) tasks.clone();
        System.out.println("Cloned List: " + clonedTasks);

        // Check if the list is empty
        System.out.println("Is list empty? " + tasks.isEmpty());

        // Remove by value
        tasks.remove("task2 - 05/14/2025");
        System.out.println("\nAfter removing task2: " + tasks);

        // Remove by index
        tasks.remove(0);
        System.out.println("After removing index 0: " + tasks);

        // Clear the list
        tasks.clear();
        System.out.println("After clearing: " + tasks);

        // Final check
        System.out.println("Is list empty now? " + tasks.isEmpty());
    }
}
