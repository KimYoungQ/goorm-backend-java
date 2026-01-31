package java_lecture.day17.TodoList;

public class Todo   {
    private String task;
    private boolean completed;

    public Todo(String task) {
        this.task = task;
        this.completed = false;
    }

    public void complete() { this.completed = true; }
    public boolean isCompleted() { return completed; }
    public String getTask() { return task; }

    @Override
    public String toString() {
        return (completed? "[완료] " : "[미완료] ") + task;
    }
}
