import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ConcreteSubjectTest {
    private ConcreteSubject Subject;

    @Before
    public void setUp() {
        Subject = new ConcreteSubject("Observer 1");
    }

    @Test
    public void testUpdate() {
        Subject.update("Test Message");
        assertEquals("Test Message", Subject.getReceivedMessage());
    }
}
