
/*

   💻 Practice Questions (1 hour)
  ✔ Create a PriorityQueue, add elements, and observe the order.
  ✔ Use `offer()` and `poll()` to manage elements.
  ✔ Check priority order using `peek()` and `poll()`.

  ---
*/

import java.util.PriorityQueue;

public class Priorityqueue {
    public static void main(String[] args) {

// In Queue interface at Integer Smallest element has Highest priority
        // PriorityQueue class extends both queue and collection interface

PriorityQueue<String> pq = new PriorityQueue<>();
pq.offer("a");
pq.offer("b");
pq.offer("c");
pq.offer("d");
System.out.println(pq);

// Removes the head element
pq.poll();
System.out.println(pq);

// gives the head element without removing it
System.out.println(pq.peek());
    }
}
