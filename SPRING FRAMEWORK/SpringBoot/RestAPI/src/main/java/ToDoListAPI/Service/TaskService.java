package ToDoListAPI.Service;

import ToDoListAPI.Model.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Service class that contains the business logic for managing tasks.
 * For now, it stores tasks in an in-memory list (no database).
 */
@Service // Marks this class as a Spring service (used in the service layer)
public class TaskService {

    // In-memory storage for tasks
    ArrayList<Task> tasks = new ArrayList<>();


     // Add a new task to the list.

    public String addTask(Task task) {
        tasks.add(task);
        return "Added Successfully";
    }

    //Get the list of all tasks.

    public List<Task> viewTask() {
        return tasks;
    }

     // Update the status of a task with the given ID.

    public String updateTask(int id, Task newStatus) {
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getId() == id) {
                tasks.get(i).setStatus(newStatus.getStatus());
                return "Updated Successfully";
            }
        }
        return "Task not found";
    }

    // Delete the task with the given ID.
    public String deleteTask(int id) {
        Task taskToRemove = null;
        for (Task task : tasks) {
            if (task.getId() == id) {
                taskToRemove = task;
                break;
            }
        }
        if (taskToRemove != null) {
            tasks.remove(taskToRemove);
            return "Task deleted successfully";
        }
        return "Task not found";
    }
}
