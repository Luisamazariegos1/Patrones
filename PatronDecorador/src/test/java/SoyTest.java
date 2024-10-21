import org.junit.Test;
import static org.junit.Assert.*;

public class SoyTest {

    @Test
    public void testSoyCost() {
        Beverage beverage = new HouseBlend();
        beverage = new Soy(beverage);
        assertEquals(1.04, beverage.cost(), 0.01);
    }

    @Test
    public void testSoyDescription() {
        Beverage beverage = new HouseBlend();
        beverage = new Soy(beverage);
        assertEquals("House Blend Coffee, Soy", beverage.getDescription());
    }
}
