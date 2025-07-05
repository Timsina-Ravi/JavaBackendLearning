import java.util.Scanner;
public class StudentMenu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        studentManagement sm = new studentManagement();
        boolean program = true;

        while (program) {
            System.out.println("0. To Exit");
            System.out.println("1. Add Student: ");
            System.out.println("2. View Student Details: ");
            System.out.println("3. Update Student Details: ");
            System.out.println("4. Delete Student Details: ");
            System.out.println("5. Search Student Details BY ID: ");
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {

                case 0:
                    System.out.println("Exiting..........");
                    program = false;
                    break;

                case 1:
                    System.out.println("Enter your ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter your Name: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter your Grade: ");
                    String grade = scanner.nextLine();
                    sm.addStudent(id, name, grade);
                    break;

                case 2:
                    sm.viewStudent();
                    break;

                case 3:
                    System.out.println("Enter id to update");
                    int newID = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter your new Name: ");
                    String newName = scanner.nextLine();
                    System.out.println("Enter your new Grade: ");
                    String newGrade = scanner.nextLine();
                    sm.updateStudent(newID,newName,newGrade);
                        break;

                case 4:
                    System.out.println("Enter id to delete");
                    int newID1 = scanner.nextInt();
                    sm.deleteStudent(newID1);
                    break;

                case 5:
                    System.out.println("Details: ");
                    System.out.println("Enter id to search");
                    int newID2 = scanner.nextInt();
                    sm.searchByID(newID2);
                    break;

                default:
                    System.out.println("Enter a valid choice");
            }
        }
    }
}


