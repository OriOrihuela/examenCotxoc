package org.lasencinas;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.lasencinas.carrera.Carrera;

public class CarreraTest {

    private Carrera carrera = null;

    @Before
    public void __init__() {
        carrera = new Carrera(0, 0);
    }

    @Test
    public void constructorTest() {
        carrera = new Carrera(20, 50);
        assertEquals(20, carrera.getTiempoEsperado());
        assertEquals(50, carrera.getDistancia(), 0.01);
    }
}
