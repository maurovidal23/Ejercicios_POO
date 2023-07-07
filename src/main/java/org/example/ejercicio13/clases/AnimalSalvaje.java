package org.example.ejercicio13.clases;

import org.example.ejercicio13.clases.Animal;

public abstract class AnimalSalvaje extends Animal {
    public AnimalSalvaje(REINO reino, TIPO tipo, String raza, MEDIO medio, boolean sexo) {
        super(reino, tipo, raza, medio, sexo);
    }

    public AnimalSalvaje(REINO reino, TIPO tipo, String raza, MEDIO medio, Animal padre, Animal madre, int generacion, boolean sexo) {
        super(reino, tipo, raza, medio, padre, madre, generacion, sexo);
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
