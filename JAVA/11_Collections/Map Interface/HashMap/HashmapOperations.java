/*`HashMap`

        1. Create a simple phonebook:
        - Implement a `HashMap` where keys are names (String) and values are phone numbers (String).
        - Add, remove, and get a contact’s number using the name as the key.
        - Print out all contacts using `keySet()` or `entrySet()`.

        2. User credentials:
        - Create a `HashMap` for storing usernames and passwords.
        - Practice adding, checking for, and removing credentials.
        - Print out a user’s password using their username.

  3. Product catalog:
  - Create a map where keys are product IDs and values are product names.
  - Add products to the map and print out all the product IDs.

        4. Check if a key exists:
        - Add a few entries to a `HashMap` and use `containsKey()` to check if a key exists.

 */

import java.util.HashMap;
import java.util.Map;

public class HashmapOperations {
    public static void main(String[] args) {


         //  1. Create a simple phonebook:

        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("name1","number1");
        hashMap.put("name2","number2");
        hashMap.put("name3","number3");
        System.out.println("Adding: " + hashMap);

        // get
        // to get keys but object
        System.out.println(hashMap.get("name1"));

        // Printing keys and values using entrySet

        for(Map.Entry<String,String> entry : hashMap.entrySet()){
            System.out.println("Name: " + entry.getKey() + "Phone: " + entry.getValue());
        }

        // remove
        hashMap.remove("name2");
        System.out.println(hashMap);
        hashMap.remove("name1","number1");
        System.out.println(hashMap);

/*
        //         2. User credentials:
        HashMap<String,String> hashMap1 = new HashMap<>();
        hashMap1.put("username1","password1");
        hashMap1.put("username2","password2");
        hashMap1.put("username3","password3");

        System.out.println(hashMap1);

        // checking for
        System.out.println(hashMap1.containsKey("username1"));

        // Remove
        System.out.println(hashMap1.remove("username3"));

        // printing user's password using username
        System.out.println(hashMap1.get("username1"));
*/
/*
        //   3. Product catalog:
        HashMap<Integer,String> hashMap2 = new HashMap<>();
        hashMap2.put(1,"Mobile");
        hashMap2.put(2,"Laptop");
        hashMap2.put(3,"Television");
           System.out.println(hashMap2);

                   // Printing all keys
            System.out.println(hashMap2.keySet());



            // 4 check with containsKey
        System.out.println(hashMap2.containsKey(1));


 */
    }
}
  