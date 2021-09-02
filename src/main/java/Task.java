public class Task {

    protected String description;
    protected boolean isDone;

    public String getDescription() {
        return description;
    }

    public boolean isDone() {
        return isDone;
    }

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    public String getStatusIcon() {
        return (isDone ? "X" : " "); // mark done task with X
    }

    public void markAsDone() {
        this.isDone = true;
    }
}