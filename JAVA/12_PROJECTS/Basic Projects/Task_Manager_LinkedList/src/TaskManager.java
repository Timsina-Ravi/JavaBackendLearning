import java.util.LinkedList;

public class TaskManager {
    private final LinkedList<Task> tasks = new LinkedList<>();

    public void addTask(Task t) {
        tasks.add(t);
        System.out.println("Task Added Successfully");
    }

    public void listTasks() {
        for (int i = 0; i < tasks.size(); i++) {
            tasks.get(i).displayTask();
        }
    }

    public void listPendingTasks() {
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getStatus().equalsIgnoreCase("Pending")) {
                tasks.get(i).displayTask();
            }
        }
    }

    public void listCompletedTasks() {
        for(int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getStatus().equalsIgnoreCase("Completed")) {
                tasks.get(i).displayTask();
            }
        }
    }

    public void updateStatus(int Priority, String newStatus) {
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getPriority() == Priority) {
                tasks.get(i).setStatus(newStatus);
                System.out.println("Status Updated Successfully ");
            }
        }
    }

    public void deleteTask(int priority){
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getPriority() == priority) {
                tasks.remove(i);
                System.out.println("Tasks Removed Successfully");
            }
    }
        }


}
