import org.junit.Test;
import static org.junit.Assert.*;

public class SoyTest {

    @Test
    public void testSoyCost() {
        Beverage beverage = new HouseBlend();  // Comenzamos con un HouseBlend
        beverage = new Soy(beverage);  // Añadimos Soy
        assertEquals(1.04, beverage.cost(), 0.01);  // Verificar que el costo sea correcto (0.89 + 0.15)
    }

    @Test
    public void testSoyDescription() {
        Beverage beverage = new HouseBlend();  // Comenzamos con un HouseBlend
        beverage = new Soy(beverage);  // Añadimos Soy
        assertEquals("House Blend Coffee, Soy", beverage.getDescription());  // Verificar que la descripción sea correcta
    }
}
