import org.junit.Test;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

public class TaskViewTest {
    @Test
    public void testDisplayTasks() {
        TaskView view = new TaskView();
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        view.displayTasks(List.of(new Task("Tarea 1"), new Task("Tarea 2")));

        String output = outputStream.toString();
        assertTrue(output.contains("Tareas:"));
        assertTrue(output.contains("Tarea 1"));
        assertTrue(output.contains("Tarea 2"));

        System.setOut(System.out); // Restore the original output
    }
}
