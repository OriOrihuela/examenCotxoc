package org.lasencinas.carrera;

import org.lasencinas.conductores.Conductores;
import org.lasencinas.tarifa.Tarifa;

public class Carrera {

    /* ---- Properties ---- */
    private int tiempoEsperado = 0;
    private double tiempoCarrera = 0;

    private double costeTotal = 0;
    private double distancia = 0;

    private String tarjetaCredito = null;
    private String origen = null;
    private String destino = null;

    private Conductores conductor = null;

    /* ---- Constructor ---- */
    public Carrera(int tiempoEsperado, double distancia) {
        this.tiempoEsperado = tiempoEsperado;
        this.distancia = distancia;
    }

    /* ---- Getters ---- */
    public String getTarjetaCredito(String tarjeta) {
        return this.tarjetaCredito;
    }

    public String getOrigen() {
        return this.origen;
    }

    public String getDestino() {
        return this.destino;
    }

    public double getDistancia() {
        return this.distancia;
    }

    public double getCosteTotal() {
        return this.costeTotal;
    }

    public int getTiempoEsperado() {
        return this.tiempoEsperado;
    }

    public double getTiempoCarrera() {
        return this.tiempoCarrera;
    }

    public double getCosteEsperado() {
        return Tarifa.getCosteTotalEsperado(this);
    }
}
