import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        TaskManager tm = new TaskManager();
        Scanner sc = new Scanner(System.in);
        boolean isComplete = true;
        while (isComplete) {
            System.out.println("Task Management System: ");
            System.out.println("0. Exit: ");
            System.out.println("1. Add Task: ");
            System.out.println("2. List All Task: ");
            System.out.println("3. List of pending Task: ");
            System.out.println("4. List of Completed Task: ");
            System.out.println("5. Update the Task Status: ");
            System.out.println("6. Delete the Task: ");

            System.out.println("Enter Your Choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("Exiting......");
                    isComplete = false;
                    break;
                case 1:
                    System.out.println("Enter Priority Number of Task: ");
                    int priority = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Your Task Name: ");
                    String name = sc.nextLine();
                    System.out.println("Enter Task Status, Pending or Completed: ");
                    String status = sc.nextLine();
                    tm.addTask(new Task(priority, name, status));
                    break;

                case 2:
                    tm.listTasks();
                    break;

                case 3:

                    tm.listPendingTasks();
                    break;

                case 4:
                    tm.listCompletedTasks();
                    break;

                case 5:
                    System.out.println("Enter Priority Number to Update: ");
                    int UpdatePriorityNum = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter New Status of a task");
                    String updateStatus = sc.nextLine();
                    tm.updateStatus(UpdatePriorityNum, updateStatus);
                    break;

                case 6:
                    System.out.println("Enter Priority Number to Delete Tasks: ");
                    int deletePriorityNum = sc.nextInt();
                    tm.deleteTask(deletePriorityNum);
                    break;
                default:
                    System.out.println("Invalid Input , Enter a valid Number: ");

            }
        }

    }

}
