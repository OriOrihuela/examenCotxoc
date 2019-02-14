package org.lasencinas;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.lasencinas.carrera.Carrera;

public class CarreraTest {

    private Carrera carrera = null;

    @Before
    public void __init__() {
        carrera = new Carrera("345345354");
    }

    @Test
    public void constructorTest() {
        carrera.setTiempoEsperado(20);
        carrera.setDistancia(50);
        assertEquals(20, carrera.getTiempoEsperado());
        assertEquals(50, carrera.getDistancia(), 0.01);
    }

    @Test
    public void realizarPagoTest() {
        carrera.realizarPago(34);
        assertEquals(carrera.getCosteEsperado(), carrera.getCosteTotal(), 0.01);

    }

    @Test
    public void realizarPagotest2() {
        carrera.realizarPago(5);
        assertEquals(carrera.getCosteEsperado(), carrera.getCosteTotal(), 0.01);
    }
}
