import java.util.Scanner;

// ✅ Main Application Class
public class Main {
    public static void main(String[] args) {
        CRUD crud = new CRUD();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("MENU: ");
            System.out.println("++++++++++++++++++++++++++++");
            System.out.println("1. ADD Details");
            System.out.println("2. View Details");
            System.out.println("3. Update Details");
            System.out.println("4. Delete Details");
            System.out.println("5. Exit");
            System.out.println("++++++++++++++++++++++++++++");
            System.out.println("Enter Your Choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    crud.add();
                    break;
                case 2:
                    crud.view();
                    break;
                case 3:
                    crud.update();
                    break;
                case 4:
                    crud.delete();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    running = false;
                    break;
                default:
                    System.out.println("Enter a valid number between 1 to 5");
            }
        }
    }
}


/*        TABLE TO CREATE

CREATE DATABASE IF NOT EXISTS JDBC;

USE JDBC;

CREATE TABLE IF NOT EXISTS crud (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    email VARCHAR(100) UNIQUE
);

 */