package org.lasencinas.tarifa;

import org.lasencinas.carrera.Carrera;

public class Tarifa {

    /* ---- Properties ---- */
    final static double costeMilla = 1.35;
    final static double costeMinuto = 0.35;
    final static double costeMínimo = 5.0;
    final static double porcentajeComisión = 0.20;

    /* ---- Getters ---- */
    public static double getCosteDistancia(double distancia) {
        return distancia * costeMilla;
    }

    public static double getCosteTiempo(double tiempo) {
        return costeMinuto * tiempo;
    }

    /*public double getCosteTotalEsperado(Carrera carrera) {
        double costeTotal =
    }*/
}
