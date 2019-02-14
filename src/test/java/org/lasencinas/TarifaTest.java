package org.lasencinas;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.lasencinas.tarifa.Tarifa;
import org.lasencinas.carrera.Carrera;

import javax.smartcardio.TerminalFactory;

public class TarifaTest {

    private Carrera carrera = null;

    @Before
    public void __init__() {
        carrera = new Carrera("345345");
    }

    @Test
    public void getCosteDistanciaTest() {
        double distancia = 9.64;
        double esperado = 13.014;
        assertEquals(esperado, Tarifa.getCosteDistancia(distancia), 0.01);
    }

    @Test
    public void getCosteTiempoTest() {
        double tiempo = 3.54;
        double esperado = 1.239;
        assertEquals(esperado, Tarifa.getCosteTiempo(tiempo), 0.01);
    }

    @Test
    public void getCosteTotalEsperadoTest() {
        Carrera carrera = new Carrera("345345");
        double costeTotal = 30 * 0.35 + 12.54 * 1.35;
        assertEquals(costeTotal, Tarifa.getCosteTotalEsperado(carrera), 0.01);
    }

    @Test
    public void getCosteTotalMínimoTest() {
        Carrera carrera = new Carrera("345345");
        double costeMinimo = 5;
        assertEquals(costeMinimo, Tarifa.getCosteTotalEsperado(carrera), 0.01);
    }
}
