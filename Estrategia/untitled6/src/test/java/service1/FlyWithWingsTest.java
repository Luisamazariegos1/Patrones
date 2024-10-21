package service1;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class FlyWithWingsTest {

    private FlyBehavior fw;
    private ByteArrayOutputStream out;

    @Before
    public void setUp() throws Exception {
        fw = new FlyWithWings();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    public void testFly() {
        fw.fly();
        assertTrue(out.toString().toLowerCase().contains("i am flying"));
    }

    @Test
    public void testToString() {

        String esperado = "flywithwings{}";
        String obtenido = fw.toString().toLowerCase();
        assertEquals(esperado, obtenido);


    }
}