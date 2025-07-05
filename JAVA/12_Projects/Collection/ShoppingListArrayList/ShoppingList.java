import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {
        ArrayList<String> shoppingList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("Welcome to your Shopping List!");

        while (running) {
            System.out.println("\nMenu:");
            System.out.println("1. Add item");
            System.out.println("2. Show all items");
            System.out.println("3. Clear list");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter the item to add: ");
                    String item = scanner.nextLine();
                    shoppingList.add(item);
                    System.out.println("Item added.");
                    break;

                case 2:
                    if (shoppingList.isEmpty()) {
                        System.out.println("Your shopping list is empty.");
                    } else {
                        System.out.println("Shopping List:");
                        for (int i = 0; i < shoppingList.size(); i++) {
                            System.out.println((i + 1) + ". " + shoppingList.get(i));
                        }
                    }
                    break;

                case 3:
                    shoppingList.clear();
                    System.out.println("Shopping list cleared.");
                    break;

                case 4:
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

