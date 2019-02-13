package org.lasencinas.conductores;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PoolConductores {

    /* ---- Properties ---- */
    private List<Conductores> poolConductores = new ArrayList<>();

    /* ---- Constructor ---- */
    public PoolConductores(List<Conductores> poolConductores) {
        this.poolConductores = poolConductores;
    }

    /* ---- Getters ---- */
    public List<Conductores> getPoolConductores() {
        return this.poolConductores;
    }

    /* ---- Setters ---- */
    public Conductores asignarConductor() {
        Collections.shuffle(this.poolConductores);
        for (Conductores conductor : this.poolConductores) {
            if (conductor.isOcupado() == false) {
                conductor.setOcupado(true);
                return conductor;
            }
        }
        System.out.println("No es posible asignar un conductor");
        return null;
    }
}
