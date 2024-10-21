import org.junit.Test;
import static org.junit.Assert.*;

public class HouseBlendTest {

    @Test
    public void testHouseBlendCost() {
        Beverage houseBlend = new HouseBlend();
        assertEquals(0.89, houseBlend.cost(), 0.01);  // Verificar que el costo sea correcto
    }

    @Test
    public void testHouseBlendDescription() {
        Beverage houseBlend = new HouseBlend();
        assertEquals("House Blend Coffee", houseBlend.getDescription());  // Verificar que la descripción sea correcta
    }
}
