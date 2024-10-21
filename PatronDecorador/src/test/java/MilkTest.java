import org.junit.Test;
import static org.junit.Assert.*;

public class MilkTest {

    @Test
    public void testMilkCost() {
        Beverage beverage = new DarkRoas();  // Comenzamos con un DarkRoast
        beverage = new Milk(beverage);  // Añadimos Milk
        assertEquals(1.09, beverage.cost(), 0.01);  // Verificar que el costo sea correcto (0.99 + 0.10)
    }

    @Test
    public void testMilkDescription() {
        Beverage beverage = new DarkRoas();  // Comenzamos con un DarkRoast
        beverage = new Milk(beverage);  // Añadimos Milk
        assertEquals("Dark Roast Coffee, Milk", beverage.getDescription());  // Verificar que la descripción sea correcta
    }
}
