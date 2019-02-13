package org.lasencinas;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.lasencinas.conductores.Conductores;

public class ConductoresTest {

    private Conductores conductor = null;

    @Before
    public void __init__() {
        conductor = new Conductores("Juan");
    }

    @Test
    public void constructorTest() {
        String nombre = "Juan";
        assertEquals(nombre, conductor.getNombre());
    }
}
