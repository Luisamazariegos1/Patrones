import org.junit.Test;
import static org.junit.Assert.*;

public class MochaTest {

    @Test
    public void testMochaCost() {
        Beverage beverage = new Espress();  // Comenzamos con un Espresso
        beverage = new Mocha(beverage);  // Añadimos Mocha
        assertEquals(2.19, beverage.cost(), 0.01);  // Verificar que el costo sea correcto (1.99 + 0.20)
    }

    @Test
    public void testMochaDescription() {
        Beverage beverage = new Espress();  // Comenzamos con un Espresso
        beverage = new Mocha(beverage);  // Añadimos Mocha
        assertEquals("Espresso, Mocha", beverage.getDescription());  // Verificar que la descripción sea correcta
    }
}
