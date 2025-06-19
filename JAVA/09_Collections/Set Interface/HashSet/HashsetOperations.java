/* `HashSet` (Useful for unique data storage)

        - Practice Questions

        1. Unique email list:
        - Implement a `HashSet` to store unique email addresses.
     - Add multiple email addresses and check for duplicates.
     - Remove an email from the set and check if it’s removed.

        2. Check if a product ID exists:
        - Create a set to store product IDs and use `contains()` to check if a product ID exists in the set.

  3. Unique tasks:
        - Create a `HashSet` to store unique tasks (like a task management app).
        - Add tasks, and then try adding a duplicate task. Check the result.

  4. Iterating over a HashSet:
        - Add a few elements to a `HashSet` and iterate over it to print each element using `for-each` or `Iterator`.
        */

import java.util.HashSet;

public class HashsetOperations {
    public static void main(String[] args) {
/*
        // 1
        HashSet<String> hashSet = new HashSet<>();
        // adding emails
      hashSet.add("ravi@gmail.com");
      hashSet.add("ravi@gmail.com");
      hashSet.add("ravit@gmail.com");
      hashSet.add("raviti@gmail.com");
      hashSet.add("ravitim@gmail.com");
      hashSet.add("ravitims@gmail.com");

      System.out.println("Added emails: " + hashSet);
                 // Checking Duplicates
            System.out.println("Duplicate found: "+ hashSet.contains("ravi@gmail.com"));

            // remove an email
        hashSet.remove("ravitim@gmail.com");
        System.out.println("After removing: " + hashSet);
*/
/*
        // 2
        HashSet<Integer> hashSet1 = new HashSet<>();
        hashSet1.add(1);
        hashSet1.add(2);
        hashSet1.add(3);
        hashSet1.add(4);
        System.out.println(hashSet1);

        // Check it is here pr not
        System.out.println(hashSet1.contains(0001));
*/

               // 3
        HashSet<String> hashSet3 = new HashSet<>();
        hashSet3.add("task1");
        hashSet3.add("task2");
        hashSet3.add("task3");
        hashSet3.add("task4");
        System.out.println(hashSet3);

        // adding duplicate
      boolean isAdded = hashSet3.add("task1");
      System.out.println("was duplicate added? " + isAdded);

      /*
// 4
        HashSet<String> hashSet4 = new HashSet<>();
        hashSet4.add("motu");
        hashSet4.add("kalu");
        hashSet4.add("budo");
        hashSet4.add("linux wala");

         for (String i : hashSet4){
             System.out.println("Adding: " +  i);
         }
*/
    }
}




