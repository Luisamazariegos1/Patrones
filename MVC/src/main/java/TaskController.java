public class TaskController {
    private TaskModel model;
    private TaskView view;

    public TaskController(TaskModel model, TaskView view) {
        this.model = model;
        this.view = view;
    }

    public void addTask(String taskName) {
        Task task = new Task(taskName);
        model.addTask(task);
        updateView();
    }

    public void updateView() {
        view.displayTasks(model.getTasks());
    }
}
