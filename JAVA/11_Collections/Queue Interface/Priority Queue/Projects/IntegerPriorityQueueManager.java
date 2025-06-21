
/*
"Integer Priority Queue Manager
      Create a program that uses a `PriorityQueue` to store integers.
       Perform the following operations:
        1. Add at least 5 integers to the queue.
        2. Peek at the smallest element.
        3. Poll elements one by one (retrieve and remove the smallest).
        4. Check if the queue is empty.
        5. Print the size of the queue."
 */

import java.util.PriorityQueue;

public class IntegerPriorityQueueManager {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // 1
        pq.add(20);
        pq.add(5);
        pq.add(14);
        pq.add(3);
        pq.add(8);
        System.out.println("Elements of queue: " + pq);

        // 2
        System.out.println("Smallest element in a queue: " + pq.peek());


// 3
        System.out.println(pq.poll());


        // 4
        if (pq.isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Queue is not empty");
        }

        // 5
        System.out.println("Size of an queue is: " + pq.size());
    }
}
