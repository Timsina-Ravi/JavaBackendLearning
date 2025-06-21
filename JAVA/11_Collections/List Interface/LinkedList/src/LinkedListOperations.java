
/*
1. `LinkedList`

       Practice Questions

1. Simple Task Queue using `LinkedList`
        - Implement a `LinkedList` to store tasks.
   - Add tasks at the beginning and end using `addFirst()` and `addLast()`.
        - Remove tasks from the front or back using `removeFirst()` and `removeLast()`.
        - Print the list of tasks.

-2. Customer List Simulation using LinkedList
- Goal: Create a `LinkedList` to simulate a list of customers waiting for service.
- Requirements:
  1. Add customers to the list.
  2. View the list of customers.
  3. Simulate serving customers by removing them from the list (serve the first customer).
  4. After serving a customer, display the remaining customers in the list.

*/
import java.io.FilterOutputStream;
import java.util.LinkedList;

public class LinkedListOperations {
   public static void main(String[] args) {

      /*
      //1

      LinkedList<String> linkedList = new LinkedList<>();
      linkedList.add("task1");
      linkedList.add("task2");
      linkedList.addFirst("taskFirst");
      linkedList.addLast("taskLast");
      System.out.println(linkedList);

      linkedList.removeFirst();
      linkedList.removeLast();
     System.out.println("After Removing First and last: " + linkedList);
*/
      // 2
LinkedList<String> linkedList = new LinkedList<>();
linkedList.add("motu");
linkedList.add("kalu");
linkedList.add("budo");
linkedList.add("linux wala");

System.out.println("Customer List Before Serving: " + linkedList);

linkedList.removeFirst() ;
System.out.println("Customer List After Serving: " + linkedList);



   }
}