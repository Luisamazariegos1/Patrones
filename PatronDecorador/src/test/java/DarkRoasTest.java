import org.junit.Test;
import static org.junit.Assert.*;

public class DarkRoasTest {

    @Test
    public void testDarkRoastCost() {
        Beverage darkRoast = new DarkRoas();
        assertEquals(0.99, darkRoast.cost(), 0.01);
    }

    @Test
    public void testDarkRoastDescription() {
        Beverage darkRoast = new DarkRoas();
        assertEquals("Dark Roast Coffee", darkRoast.getDescription());
    }
}
