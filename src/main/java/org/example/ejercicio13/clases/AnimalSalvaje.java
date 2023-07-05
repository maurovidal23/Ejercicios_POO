package org.example.ejercicio13.clases;

import org.example.ejercicio13.clases.Animal;

public abstract class AnimalSalvaje extends Animal {
    public AnimalSalvaje(REINO reino, TIPO tipo, String raza, MEDIO medio) {
        super(reino, tipo, raza, medio);
    }
    @Override
    public String toString() {
        return "AnimalSalvaje{" +
                "reino=" + nombresReinos.get(this.getReino()) +
                ", tipo=" + nombresTipos.get(this.getTipo()) +
                ", raza='" + this.getRaza() + '\'' +
                ", medio=" + nombresMedios.get(this.getMedio()) +
                '}';
    }

}
