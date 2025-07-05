import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        HashMap<String, String> phoneBook = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("Welcome to Phone Book!");

        while (running) {
            System.out.println("\nMenu:");
            System.out.println("1. Add contact");
            System.out.println("2. Look up contact");
            System.out.println("3. Remove contact");
            System.out.println("4. Show all contacts");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter contact name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String number = scanner.nextLine();
                    phoneBook.put(name, number);
                    System.out.println("Contact added.");
                    break;

                case 2:
                    System.out.print("Enter contact name to look up: ");
                    String searchName = scanner.nextLine();
                    if (phoneBook.containsKey(searchName)) {
                        System.out.println(searchName + "'s number: " + phoneBook.get(searchName));
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter contact name to remove: ");
                    String removeName = scanner.nextLine();
                    if (phoneBook.remove(removeName) != null) {
                        System.out.println("Contact removed.");
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;

                case 4:
                    if (phoneBook.isEmpty()) {
                        System.out.println("Phone book is empty.");
                    } else {
                        System.out.println("All contacts:");
                        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
                            System.out.println(entry.getKey() + " : " + entry.getValue());
                        }
                    }
                    break;

                case 5:
                    running = false;
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
        scanner.close();
    }
}

