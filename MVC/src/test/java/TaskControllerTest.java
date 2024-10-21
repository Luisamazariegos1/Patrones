import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TaskControllerTest {
    private TaskModel model;
    private TaskView view;
    private TaskController controller;

    @Before
    public void setUp() {
        model = new TaskModel();
        view = new TaskView();
        controller = new TaskController(model, view);
    }

    @Test
    public void testAddTask() {
        controller.addTask("New Task");
        assertEquals(1, model.getTasks().size());
        assertEquals("New Task", model.getTasks().get(0).getName());
    }

    @Test
    public void testUpdateView() {
        controller.addTask("Task A");
        assertEquals(1, model.getTasks().size());
    }
}
