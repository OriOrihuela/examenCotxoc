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

    @Test
    public void realizarPagoTest() {
        carrera = new Carrera(20, 20);
        carrera.realizarPago(34);
        assertEquals(carrera.getCosteEsperado(), carrera.getCosteTotal(), 0.01);

    }

    @Test
    public void realizarPagotest2() {
        carrera = new Carrera(1,1);
        carrera.realizarPago(5);
        assertEquals(carrera.getCosteEsperado(), carrera.getCosteTotal(), 0.01);
    }
}
