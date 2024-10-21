package service1;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class FlyNotWayTest {
    private FlyNotWay fw;
    private ByteArrayOutputStream out;

    @Before
    public void setUp() throws Exception {
        fw = new FlyNotWay();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    public void testFly() {
        fw.fly();
        assertTrue(out.toString().toLowerCase().contains("i cannot fly"));
    }

    @Test
    public void testToString() {
        String esperado = "flynotway{}";
        String obtenido = fw.toString().toLowerCase();
        assertEquals(esperado, obtenido);
    }
}