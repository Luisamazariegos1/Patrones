package service1;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class SquickTest {

    private Squick s;
    private ByteArrayOutputStream out;

    @Before
    public void setUp() throws Exception {
        s = new Squick();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    public void testSound() {
        s.sound();
        assertTrue(out.toString().toLowerCase().contains("i am squick sound"));
    }

    @Test
    public void testToString() {

        String esperado = "squick{}";
        String obtenido = s.toString().toLowerCase();
        assertEquals(esperado, obtenido);


    }
}