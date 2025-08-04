package ToDoListAPI.Controller;

import ToDoListAPI.Model.Task;
import ToDoListAPI.Service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * This is a REST controller — it handles HTTP requests (like POST, GET, etc.)
 * and returns data directly (usually as JSON).
 */
@RestController // Combines @Controller + @ResponseBody. All methods return JSON by default.
@RequestMapping("/api") // Base path for all endpoints in this controller (e.g., /api/tasks)
public class TaskController {

    // Injects (auto-wires) the TaskService dependency into this controller.
    @Autowired
    TaskService taskService;

    /**
     * Handle POST request to create a new task.
     * @RequestBody means: convert incoming JSON into a Task object.
     */
    @PostMapping("/tasks")
    public String addTask(@RequestBody Task task) {
        return taskService.addTask(task);
    }

    /**
     * Handle GET request to fetch all tasks.
     * Returns a list of Task objects as JSON.
     */
    @GetMapping("/tasks")
    public List<Task> getAllTask() {
        return taskService.viewTask();
    }

    /**
     * Handle PUT request to update a task by its ID.
     * @PathVariable extracts the {id} from the URL.
     * @RequestBody reads the updated task data from the request.
     */
    @PutMapping("/tasks/{id}")
    public String updateTask(@PathVariable int id, @RequestBody Task newTitle) {
        return taskService.updateTask(id, newTitle);
    }

    /**
     * Handle DELETE request to remove a task by ID.
     */
    @DeleteMapping("/tasks/{id}")
    public String deleteTask(@PathVariable int id) {
        return taskService.deleteTask(id);
    }
}

