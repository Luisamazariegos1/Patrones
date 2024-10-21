package service1;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class ModelDuckTest {

    private ModelDuck s;
    private ByteArrayOutputStream out;

    @Before
    public void setUp() throws Exception {
        s = new ModelDuck();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    public void testSwim() {
        s.swim();
        assertTrue(out.toString().toLowerCase().contains("the duck is swimming"));
    }

    @Test
    public void testFly() {
        s.performFly();
        assertTrue(out.toString().toLowerCase().contains("i cannot fly"));
    }

    @Test
    public void testQuack() {
        s.performQuack();
        assertTrue(out.toString().toLowerCase().contains("i cannot make sound"));
    }

    @Test
    public void testDisplay() {
        s.display();
        assertTrue(out.toString().toLowerCase().contains("i am a model duck"));
    }

    @Test
    public void testToString() {

        String esperado = "modelduck{}";
        String obtenido = s.toString().toLowerCase();
        assertEquals(esperado, obtenido);

    }
    @Test
    public void testCambioFly (){
        s.performFly();
        assertTrue(out.toString().toLowerCase().contains("i cannot fly"));

        s.setFb(new FlyLikeRocket());
        s.performFly();
        assertTrue(out.toString().toLowerCase().contains("i fly to space"));
    }

}