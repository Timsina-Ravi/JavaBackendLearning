/*

 3. To-Do List API

Objective:
Build an API to manage a to-do list.

Model:
`Task` should contain:
- `int id`
- `String title`
- `String status` (e.g., "Pending", "Completed")

Endpoints:
1. Add a new task
2. Get all tasks
3. Update task status by ID
4. Delete a task by ID


 */


package ToDoListAPI.Model;

public class Task {
    private int id;
    private String title;
    private String status;

    public Task(int id, String title, String status) {
        this.id = id;
        this.title = title;
        this.status = status;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
