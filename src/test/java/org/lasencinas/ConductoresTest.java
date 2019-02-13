package org.lasencinas;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.lasencinas.conductores.Conductores;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    @Test
    public void valoracionMediaTest() {
        List<Double> valoraciones = new ArrayList<>(Arrays.asList(5.65, 4.56, 2.45, 8.99));
        for (double valoracion : valoraciones){
            conductor.setValoracion(valoracion);
        }
        conductor.setValoracionMedia();
        assertEquals(5.4125, conductor.getValoracionMedia(), 0.01);
    }
}
