
/*

🗓️ Day 1: ArrayList + OOP Basics (Single Class, Real Logic)

 🛠 Task: Build a `ToDoList` Manager

Step-by-step tasks:
        1. Create `ToDoList` class:
        - `ArrayList<String> tasks`
        2. Methods:
        - `addTask(String task)`
        - `getAllTasks()`
        - `removeTask(String task)`
        - `clearAll()`

        > 🧠 Focus: Just get used to using `ArrayList` as a field inside a class.
*/


import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {

        ArrayList<String> tasks = new ArrayList<>();

        public  void addTask(String task ){
            tasks.add(task);
        }
        public void getAllTasks(){
            if (tasks.isEmpty()){
                System.out.println("No tasks to show");
            }else {
             System.out.println("Your Tasks: ");
                for (int i = 0; i < tasks.size(); i++) {
                    System.out.println(tasks.get(i));
                }
            }
        }
        public void removeTask(String task ){
           if (tasks.remove(task)){
               System.out.println("Removed Successfully");
           }else {
               System.out.println("Task not found");
           }
        }
        public void clearAll(){
            tasks.clear();
            System.out.println("All tasks cleared! ");


        }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ToDoList toDoList = new ToDoList();
        boolean run = true;
while (run) {

    System.out.println("Menu: ");
    System.out.println("1. Add Task ");
    System.out.println("2. View Task ");
    System.out.println("3. Remove Task ");
    System.out.println("4. Clear Task ");
    System.out.println("5. EXit ");
    System.out.println("Enter your choice: ");
    int choice = sc.nextInt();
    sc.nextLine();

    switch (choice) {
        case 1:
            System.out.println("Enter task to add: ");
            String taskToAdd =sc.nextLine();
            toDoList.addTask(taskToAdd);
            System.out.println("Added Successfully");

            break;
        case 2:
            toDoList.getAllTasks();
            break;
        case 3:
            System.out.println("Enter task to remove");
            String taskToRemove = sc.nextLine();
            toDoList.removeTask(taskToRemove);
            break;
        case 4:
            toDoList.clearAll();
            break;

        case 5:
            System.out.println("Exiting....");
            run=false;
           break;
        default:
            System.out.println("Enter a valid number");


    }
}
sc.close();
    }
}
