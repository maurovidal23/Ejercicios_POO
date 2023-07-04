package org.example.ejercicio11.clases;

import org.example.ejercicio10.clase.Animal;

public class AnimalGranja extends Animal implements IPropietario {

    String Propietario;

    public AnimalGranja(REINO reino, TIPO tipo, String raza, MEDIO medio, String propietario) {
        super(reino, tipo, raza, medio);
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
        return "Animal_Granja{" +
                "Propietario='" + Propietario + '\'' +
                ", tipo=" + this.getTipo()  +
                ", raza='" + this.getRaza() + '\'' +
                '}';
    }


}
