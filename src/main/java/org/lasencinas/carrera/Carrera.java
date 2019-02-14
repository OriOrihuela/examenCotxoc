package org.lasencinas.carrera;

import org.lasencinas.conductores.Conductores;
import org.lasencinas.conductores.PoolConductores;
import org.lasencinas.tarifa.Tarifa;

public class Carrera {

    /* ---- Properties ---- */
    private int tiempoEsperado = 0;
    private double tiempoCarrera = 0;

    private double costeTotal = 0;
    private double distancia = 0;
    private double propina = 0;

    private String tarjetaCredito = null;
    private String origen = null;
    private String destino = null;

    private Conductores conductor = null;

    /* ---- Constructor ---- */
    public Carrera(String tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    /* ---- Getters ---- */
    public String getTarjetaCredito() {
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

    public double getPropina() {
        return this.propina;
    }

    public Conductores getConductor() {
        return this.conductor;
    }

    public double getCosteEsperado() {
        return Tarifa.getCosteTotalEsperado(this);
    }

    /* ---- Setters ---- */

    public void realizarPago(double pago) {
        this.costeTotal = pago;
    }

    public void recibirPropina(double propina) {
        this.propina = propina;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public void setTiempoEsperado(int tiempo) {
        this.tiempoEsperado = tiempo;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public void setConductor(Conductores conductor) {
        this.conductor = conductor;
    }

    public void asignarConductor(PoolConductores conductor) {
        setConductor(conductor.asignarConductor());
    }

    public void liberarConductor() {
        getConductor().setOcupado(false);
    }
}
