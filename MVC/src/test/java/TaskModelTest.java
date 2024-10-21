import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TaskModelTest {
    private TaskModel model;

    @Before
    public void setUp() {
        model = new TaskModel();
    }

    @Test
    public void testAddTask() {
        model.addTask(new Task("Test Task"));
        assertEquals(1, model.getTasks().size());
        assertEquals("Test Task", model.getTasks().get(0).getName());
    }

    @Test
    public void testGetTasks() {
        model.addTask(new Task("Task 1"));
        model.addTask(new Task("Task 2"));
        assertEquals(2, model.getTasks().size());
    }
}
