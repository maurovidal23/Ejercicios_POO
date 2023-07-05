package org.example.ejercicio13.clases;

import org.example.ejercicio13.clases.Animal;
import org.example.ejercicio11.clases.IPropietario;

public abstract class AnimalGranja extends Animal implements IPropietario {

    String Propietario;

    public AnimalGranja(REINO reino, TIPO tipo, String raza, MEDIO medio, boolean sexo, String propietario) {
        super(reino, tipo, raza, medio, sexo);
        Propietario = propietario;
    }

    public AnimalGranja(REINO reino, TIPO tipo, String raza, MEDIO medio, Animal padre, Animal madre, int generacion, boolean sexo, String propietario) {
        super(reino, tipo, raza, medio, padre, madre, generacion, sexo);
        Propietario = propietario;
    }

    @Override
    public String getPropietario() {

        return Propietario;
    }

    @Override
    public void setPropietario(String propietario) {

        Propietario = propietario;
    }

    @Override
    public String toString() {

        return "AnimalGranja{" + "Propietario='" + Propietario + '\'' + ", tipo=" + Animal.nombresTipos.get(this.getTipo()) + ", raza='" + this.getRaza() + '}';

    }

}
