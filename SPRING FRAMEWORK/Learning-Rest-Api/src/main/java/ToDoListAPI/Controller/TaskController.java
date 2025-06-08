package ToDoListAPI.Controller;

import ToDoListAPI.Model.Task;
import ToDoListAPI.Service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TaskController {
    @Autowired
    TaskService taskService;

    @PostMapping("/tasks")
    public String addTask(@RequestBody Task task) {
       return taskService.addTask(task);
    }

    @GetMapping("/tasks")
    public List<Task> getAllTask() {
        return taskService.viewTask();
    }

    @PutMapping("/tasks/{id}")
    public String updateTask(@PathVariable  int id, @RequestBody Task newTitle) {
       return taskService.updateTask(id, newTitle);
    }

    @DeleteMapping("/tasks/{id}")
    public String deleteTask(@PathVariable int id){
       return taskService.deleteTask(id);
    }


    }




