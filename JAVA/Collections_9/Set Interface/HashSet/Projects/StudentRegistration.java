
/*
Mini-Project: Student Registration System
Problem Statement:
Create a Student Registration System using HashSet in Java. The system should allow users to:

Add a student (ensuring no duplicate entries).
Remove a student by name.
        Check if a student is registered.
Display all registered students.
Clear all students from the system.
Exit the program.
        Requirements:
Use a HashSet<String> to store student names.
Implement a menu-driven program that repeatedly allows the user to choose an option until they exit.
Use basic Java methods like add(), remove(), contains(), clear(), and size()

 */

import java.util.HashSet;
import java.util.Scanner;

public class StudentRegistration {
    public static void main(String[] args) {
        HashSet<String> students = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nStudent Registration System");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Check if Student Exists");
            System.out.println("4. Display All Students");
            System.out.println("5. Clear All Students");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1: // Add student
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    if (students.add(name)) {
                        System.out.println(name + " added successfully.");
                    } else {
                        System.out.println(name + " is already registered.");
                    }
                    break;

                case 2: // Remove student
                    System.out.print("Enter student name to remove: ");
                    String removeName = scanner.nextLine();
                    if (students.remove(removeName)) {
                        System.out.println(removeName + " removed successfully.");
                    } else {
                        System.out.println(removeName + " not found.");
                    }
                    break;

                case 3: // Check if student exists
                    System.out.print("Enter student name to check: ");
                    String checkName = scanner.nextLine();
                    if (students.contains(checkName)) {
                        System.out.println(checkName + " is registered.");
                    } else {
                        System.out.println(checkName + " is NOT registered.");
                    }
                    break;

                case 4: // Display all students
                    System.out.println("Registered Students: " + students);
                    break;

                case 5: // Clear all students
                    students.clear();
                    System.out.println("All students removed.");
                    break;

                case 6: // Exit
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 6);

        scanner.close();
    }
}


