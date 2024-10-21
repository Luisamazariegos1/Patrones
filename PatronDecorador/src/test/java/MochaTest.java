import org.junit.Test;
import static org.junit.Assert.*;

public class MochaTest {

    @Test
    public void testMochaCost() {
        Beverage beverage = new Espress();
        beverage = new Mocha(beverage);
        assertEquals(2.19, beverage.cost(), 0.01);
    }

    @Test
    public void testMochaDescription() {
        Beverage beverage = new Espress();
        beverage = new Mocha(beverage);
        assertEquals("Espresso, Mocha", beverage.getDescription());
    }
}
