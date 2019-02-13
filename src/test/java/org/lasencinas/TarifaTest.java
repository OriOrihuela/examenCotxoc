package org.lasencinas;

import static org.junit.Assert.*;
import org.junit.Test;
import org.lasencinas.tarifa.Tarifa;

public class TarifaTest {

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
}
