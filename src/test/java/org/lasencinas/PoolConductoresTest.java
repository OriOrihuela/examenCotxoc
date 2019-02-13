package org.lasencinas;

import org.junit.Test;
import static org.junit.Assert.*;
import org.lasencinas.carrera.Carrera;
import org.lasencinas.conductores.Conductores;
import org.lasencinas.conductores.PoolConductores;

import java.util.List;
import java.util.ArrayList;

public class PoolConductoresTest {

    Carrera carrera = new Carrera(20, 20);

    @Test
    public void asignarConductorTest() {
        String nombre = "Giuseppe";
        Conductores conductor = new Conductores(nombre);
        List<Conductores> poolConductores = new ArrayList<>();
        poolConductores.add(conductor);
        PoolConductores conductores = new PoolConductores(poolConductores);
        carrera.asignarConductor(conductores);
        assertEquals(conductor, carrera.getConductor());
    }
}