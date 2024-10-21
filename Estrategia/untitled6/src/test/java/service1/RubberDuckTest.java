package service1;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class RubberDuckTest {

    private RubberDuck RB;
    private ByteArrayOutputStream out;

    @Before
    public void setUp() throws Exception {
        RB = new RubberDuck();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    public void testSwim() {
        RB.swim();
        assertTrue(out.toString().toLowerCase().contains("the duck is swimming"));
    }
    @Test
    public void  testFly() {
        RB.performFly();
        assertTrue(out.toString().toLowerCase().contains("i cannot fly"));
    }
    @Test
    public void testQuack() {
        RB.performQuack();
        assertTrue(out.toString().toLowerCase().contains("i am mutesound"));
    }
    @Test
    public void testDisplay() {
        RB.display();
        assertTrue(out.toString().toLowerCase().contains("hi i am a rubberduck duck"));
    }

    @Test
    public void testToString() {
        String esperado = "rubberduck{}";
        String obtenido = RB.toString().toLowerCase();
        assertEquals(esperado, obtenido);
    }

}