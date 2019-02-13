package org.lasencinas.conductores;

import java.util.ArrayList;
import java.util.List;

public class Conductores {

    /* ---- Properties --- */
    private String nombre = null;
    private String modelo = null;
    private String matricula = null;

    private double valoracionMedia = 0;
    private List<Double> valoraciones = new ArrayList<>();

    private boolean ocupado = false;

    /* ---- Constructor ---- */
    public Conductores(String nombre) {
        this.nombre = nombre;
    }

    /* ---- Getters ---- */
    public String getNombre() {
        return this.nombre;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public String getModelo() {
        return this.modelo;
    }

    public double getValoracion() {
        return this.valoracionMedia;
    }

    public List<Double> getValoraciones() {
        return this.valoraciones;
    }

    public boolean isOcupado() {
        return this.ocupado;
    }

    /* ---- Setters ---- */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public void setValoracion(double valoracion) {
        this.valoraciones.add(valoracion);
    }

    public void setValoracionMedia() {
        this.valoracionMedia = calcularValoraciónMedia(this.valoraciones);
    }

    private double calcularValoraciónMedia(List<Double> valoraciones) {
        double valoracionMedia = 0;
        double sumaValoraciones = 0;
        for (double valoracion : valoraciones) {
            sumaValoraciones += valoracion;
        }
        valoracionMedia = sumaValoraciones / this.valoraciones.size();
        return valoracionMedia;
    }
}
