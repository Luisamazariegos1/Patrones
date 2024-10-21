import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ConcreteObserverTest {
    private ConcreteObserver observer;

    @Before
    public void setUp() {
        observer = new ConcreteObserver("Observer 1");
    }

    @Test
    public void testUpdate() {
        observer.update("Test Message");
        assertEquals("Test Message", observer.getReceivedMessage());
    }
}
