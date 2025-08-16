class Task{

    private int priority;
    private String name;
    private String status;

    public Task(int priority, String name, String status){
        this.priority = priority;
        this.name = name;
        this.status = status;
    }

    public void setPriority(int priority){
        this.priority = priority;
    }

    public int getPriority(){
        return priority;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setStatus(String status){
        this.status = status;
    }

    public String getStatus(){
        return status;
    }

    public void displayTask(){

        System.out.println("Task Details: " );
        System.out.println("Task Priority: " + priority);
        System.out.println("Task Name: " + name);
        System.out.println("Task Status: " + status);
    }


}