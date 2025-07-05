import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {

        // PriorityQueue stores elements in natural order (for Strings: alphabetical)
        // The smallest element has the highest priority

        PriorityQueue<String> pq = new PriorityQueue<>();

        // Add elements to the queue
        pq.offer("a");
        pq.offer("b");
        pq.offer("c");
        pq.offer("d");

        // Print the queue (Note: order may not look sorted, but poll() will give lowest)
        System.out.println("Initial Queue: " + pq);

        // Remove and return the head element (smallest in natural order)
        pq.poll();  // removes "a"
        System.out.println("After poll(): " + pq);

        // Peek at the head element without removing it
        System.out.println("Head of queue (peek): " + pq.peek());
    }
}
