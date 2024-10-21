import org.junit.Test;
import static org.junit.Assert.*;

public class MilkTest {

    @Test
    public void testMilkCost() {
        Beverage beverage = new DarkRoas();
        beverage = new Milk(beverage);
        assertEquals(1.09, beverage.cost(), 0.01);
    }

    @Test
    public void testMilkDescription() {
        Beverage beverage = new DarkRoas();
        beverage = new Milk(beverage);
        assertEquals("Dark Roast Coffee, Milk", beverage.getDescription());
    }
}
