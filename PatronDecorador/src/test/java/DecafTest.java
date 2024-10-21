import org.junit.Test;
import static org.junit.Assert.*;

public class DecafTest {

    @Test
    public void testDecafCost() {
        Beverage decaf = new Decaf();
        assertEquals(1.05, decaf.cost(), 0.01);
    }

    @Test
    public void testDecafDescription() {
        Beverage decaf = new Decaf();
        assertEquals("Decaf Coffee", decaf.getDescription());
    }
}
