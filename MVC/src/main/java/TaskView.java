import java.util.List;

public class TaskView {
    public void displayTasks(List<Task> tasks) {
        System.out.println("Tareas:");
        for (Task task : tasks) {
            System.out.println("- " + task.getName());
        }
    }
}
