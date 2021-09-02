public class ToDo extends Task {
    protected boolean isDone;

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    public ToDo(String description) {
        super(description);
        isDone = false;

    }

    public String toString() {
        return "[T][" + getStatusIcon() + "] " + description;
    }
}