import org.junit.Test;
import static org.junit.Assert.*;

public class EspressTest {

    @Test
    public void testEspressoCost() {
        Beverage espress = new Espress();
        assertEquals(1.99, espress.cost(), 0.01);
    }

    @Test
    public void testEspressoDescription() {
        Beverage espress = new Espress();
        assertEquals("Espresso", espress.getDescription());
    }
}
