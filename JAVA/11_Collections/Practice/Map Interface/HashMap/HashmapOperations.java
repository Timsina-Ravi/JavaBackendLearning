import java.util.HashMap;
import java.util.Map;

public class HashmapOperations {
    public static void main(String[] args) {

        // 1. Create a simple phonebook using HashMap
        HashMap<String, String> phoneBook = new HashMap<>();

        // Add entries (name -> phone number)
        phoneBook.put("Alice", "123-4567");
        phoneBook.put("Bob", "987-6543");
        phoneBook.put("Charlie", "555-1212");

        System.out.println("Phonebook: " + phoneBook);

        // 2. Get phone number by name (key)
        System.out.println("Alice's number: " + phoneBook.get("Alice"));

        // 3. Print all names (keys)
        System.out.println("All names: " + phoneBook.keySet());

        // 4. Print all name-number pairs
        System.out.println("\nFull entries:");
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            System.out.println("Name: " + entry.getKey() + ", Phone: " + entry.getValue());
        }

        // 5. Remove an entry by key
        phoneBook.remove("Bob");
        System.out.println("\nAfter removing Bob: " + phoneBook);

        // 6. Remove entry only if key and value both match
        phoneBook.remove("Alice", "123-4567");  // returns true if removed
        System.out.println("After removing Alice with value match: " + phoneBook);

        // 7. Check if a key exists
        System.out.println("Contains 'Alice'? " + phoneBook.containsKey("Alice"));

        // 8. Remove another entry and show the removed value
        String removed = phoneBook.remove("Charlie");
        System.out.println("Removed Charlie's number: " + removed);

        // 9. Try to get a value for a non-existing key
        System.out.println("Trying to get Alice's number again: " + phoneBook.get("Alice"));  // should be null

        // 10. containsKey with incorrect type (will always return false)
        System.out.println("Contains key 1? " + phoneBook.containsKey(1));  // wrong type: int instead of String
    }
}
