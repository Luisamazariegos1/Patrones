package service1;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class FlyLikeRocketTest {

    private FlyLikeRocket fn;
    private ByteArrayOutputStream out;

    @Before
    public void setUp() throws Exception {
        fn = new FlyLikeRocket();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    public void testFly() {
        fn.fly();
        assertTrue(out.toString().toLowerCase().contains("como un cohete"));
    }

    @Test
    public void testToString() {

        String esperado = "flylikerocket{}";
        String obtenido = fn.toString().toLowerCase();
        assertEquals(esperado, obtenido);


    }
}