package org.lasencinas.carrera;

import org.lasencinas.conductores.Conductores;

public class Carrera {

    /* ---- Properties ---- */
    private int tiempoEsperado = 0;
    private int tiempoCarrera = 0;
    private double costeTotal = 0;
    private String tarjetaCredito = null;
    private Conductores conductor = null;

    /* ---- Constructor ---- */
    public Carrera(int tiempoEsperado, int tiempoCarrera, double costeTotal, Conductores conductor) {
        this.tiempoEsperado = tiempoEsperado;
        this.tiempoCarrera = tiempoCarrera;
        this.costeTotal = costeTotal;
        this.conductor = conductor;
    }

    /* ---- Getters ---- */
    public String getTarjetaCredito(String tarjeta) {
        return this.tarjetaCredito;
    }


}
