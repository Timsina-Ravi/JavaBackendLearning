import java.util.LinkedList;

public class LinkedListOperations {
   public static void main(String[] args) {

      // Create a LinkedList of tasks
      LinkedList<String> linkedList = new LinkedList<>();

      // Add elements to the list
      linkedList.add("task1");
      linkedList.add("task2");

      // Add elements at the beginning and end
      linkedList.addFirst("taskFirst");
      linkedList.addLast("taskLast");

      // Print the full list
      System.out.println("Initial List: " + linkedList);

      // Remove first and last elements
      linkedList.removeFirst();
      linkedList.removeLast();

      System.out.println("After removing first and last: " + linkedList);

      // Peek at the first element (does not remove it)
      System.out.println("Peek first: " + linkedList.peekFirst());

      // Peek at the last element (does not remove it)
      System.out.println("Peek last: " + linkedList.peekLast());

      // Check if list contains an element
      boolean hasTask1 = linkedList.contains("task1");
      System.out.println("Contains 'task1'? " + hasTask1);

      // Get element by index
      System.out.println("Element at index 0: " + linkedList.get(0));

      // Set/replace element at index 0
      linkedList.set(0, "updatedTask");
      System.out.println("After update: " + linkedList);

      // Remove a specific element by value
      linkedList.remove("task2");
      System.out.println("After removing 'task2': " + linkedList);

      // Check if the list is empty
      System.out.println("Is list empty? " + linkedList.isEmpty());

      // Clear the list
      linkedList.clear();
      System.out.println("After clearing the list: " + linkedList);
   }
}
