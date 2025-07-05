import java.util.HashSet;
import java.util.Scanner;

public class GuestListManager {
    public static void main(String[] args) {
        HashSet<String> guests = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("Welcome to Guest List Manager!");

        while (running) {
            System.out.println("\nMenu:");
            System.out.println("1. Add guest");
            System.out.println("2. Show all guests");
            System.out.println("3. Remove guest");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter guest name to add: ");
                    String nameToAdd = scanner.nextLine();
                    if (guests.add(nameToAdd)) {
                        System.out.println("Guest added.");
                    } else {
                        System.out.println("Guest is already in the list.");
                    }
                    break;

                case 2:
                    if (guests.isEmpty()) {
                        System.out.println("Guest list is empty.");
                    } else {
                        System.out.println("Guest list:");
                        for (String guest : guests) {
                            System.out.println(guest);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter guest name to remove: ");
                    String nameToRemove = scanner.nextLine();
                    if (guests.remove(nameToRemove)) {
                        System.out.println("Guest removed.");
                    } else {
                        System.out.println("Guest not found.");
                    }
                    break;

                case 4:
                    running = false;
                    System.out.println("Exiting...!");
                    break;

                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
        scanner.close();
    }
}

