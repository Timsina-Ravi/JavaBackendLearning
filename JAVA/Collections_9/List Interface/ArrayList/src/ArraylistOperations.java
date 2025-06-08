/*Day 1: `ArrayList` (Essential for Spring Boot)

- Theory (30 minutes - 1 hour):
        - Read about `ArrayList` and its basic operations (`add()`, `remove()`, `get()`, `size()`, and iteration).

        - Practice Questions (2.5-3 hours):

        1. Create a simple to-do list:
        - Implement an `ArrayList` to store tasks (task name and due date).
        - Perform basic operations (add, remove, get) on the list.
        - Print the list and show how many tasks are present.

        2. Add and remove items:
        - Create a list of integers and:
        - Add some numbers.
       - Remove some numbers.
       - Get the size of the list.
        - Print out the list using a `for-each` loop.

  3. Index-based access:
        - Create a list of strings and practice accessing elements by their index.
        - Modify elements at certain indices and print the updated list.

        4. List iteration:
        - Iterate through a list of products (name, price) and print each item.
*/


import java.util.ArrayList;


public class ArraylistOperations {
    public static void main(String[] args) {
/*
      // 1
        ArrayList arrayList = new ArrayList<>();
        // Add
     arrayList.add("task1"+"03/14/2025");
     arrayList.add("task2"+"05/14/2025");
     arrayList.add("task3"+"04/14/2025");

     System.out.println(arrayList);


        // to get elements
        System.out.println("Get Element using get: " +arrayList.get(0));

        // Printing the list
        for (int i = 0; i <arrayList.size() ; i++) {
            System.out.println("Printing list using for loop: " + arrayList.get(i));
        }
        // Remove
       // To remove by object --->
        arrayList.remove("task2"+"05/14/2025");
        System.out.println("Removing  by using remove with object: " +arrayList);

        // to remove by index
          arrayList.remove(0);
         System.out.println("Removing by using remove with index: " + arrayList);


*/
/*
        // 2
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        // Add
        arrayList1.add(1);
        arrayList1.add(2);
        arrayList1.add(3);
        arrayList1.add(4);
        arrayList1.add(5);
System.out.println("Adding Numbers: " +arrayList1);

// Remove
        arrayList1.remove(1);
        System.out.println(arrayList1);

        // size
        System.out.println("Size of list " + arrayList1.size());

        // Get the list using for -each
        for(int i : arrayList1){
            System.out.println("List: " + i);

        }
*/
/*
        // 3
        ArrayList<String> arrayList3 = new ArrayList<>();
        arrayList3.add("kalu");
        arrayList3.add("motu");
        arrayList3.add("budo");
        arrayList3.add("linux");

        System.out.println("adding strings: " + arrayList3);

        // get strings by index
        System.out.println("getting strings by index: " + arrayList3.get(1));

        // changing the string using set
         arrayList3.set(3,"ai");
        System.out.println("Updated List: " + arrayList3);
*/
        // 4
        ArrayList<String> arrayList4 = new ArrayList<>();
        arrayList4.add("pen" + "Rs: 20");
        arrayList4.add("copy" + "Rs: 50");
        arrayList4.add("Scale" + "Rs: 25");

        // using for loop
        for (int i = 0; i <arrayList4.size() ; i++) {
            System.out.println("For i: " +arrayList4.get(i));
        }

        // using for-each loop
        for (String i : arrayList4){
            System.out.println("For-each: " + i);
        }

    }


}