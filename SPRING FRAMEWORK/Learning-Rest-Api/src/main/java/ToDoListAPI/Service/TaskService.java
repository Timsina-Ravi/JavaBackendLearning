package ToDoListAPI.Service;

import ToDoListAPI.Model.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class TaskService {
    ArrayList<Task> tasks = new ArrayList<>();

    public String addTask(Task task) {
        tasks.add(task);
        return "Added Successfully";
    }

    public List<Task> viewTask() {
        return tasks;
    }

    public String updateTask(int id, Task newStatus) {
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getId() == id) {
                tasks.get(i).setStatus(newStatus.getStatus());
                return "Updated Successfully";
            }
        }
        return "Task not found ";
    }


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
