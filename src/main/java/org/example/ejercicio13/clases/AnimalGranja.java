package org.example.ejercicio13.clases;

import org.example.ejercicio13.clases.Animal;
import org.example.ejercicio11.clases.IPropietario;
import org.example.ejercicio22.clases.Granjero;

public abstract class AnimalGranja extends Animal implements IPropietario {

    String Propietario;
    Granjero granjeroPropietario;

    public AnimalGranja(REINO reino, TIPO tipo, String raza, MEDIO medio, boolean sexo, String propietario) {
        super(reino, tipo, raza, medio, sexo);
        Propietario = propietario;
    }

    public AnimalGranja(REINO reino, TIPO tipo, String raza, MEDIO medio, Animal padre, Animal madre, int generacion, boolean sexo, String propietario) {
        super(reino, tipo, raza, medio, padre, madre, generacion, sexo);
        Propietario = propietario;
    }
    public AnimalGranja(REINO reino, TIPO tipo, String raza, MEDIO medio, boolean sexo, Granjero propietario) {
        super(reino, tipo, raza, medio, sexo);
        granjeroPropietario = propietario;
        Granjero.añadirAnimal(propietario,this);
    }

    public AnimalGranja(REINO reino, TIPO tipo, String raza, MEDIO medio, Animal padre, Animal madre, int generacion, boolean sexo, Granjero propietario) {
        super(reino, tipo, raza, medio, padre, madre, generacion, sexo);
        granjeroPropietario = propietario;
        Granjero.añadirAnimal(propietario,this);
    }

    @Override
    public String getPropietario() {

        return Propietario;
    }

    @Override
    public void setPropietario(String propietario) {

        Propietario = propietario;
    }

    public Granjero getGranjeroPropietario() {
        return granjeroPropietario;
    }

    public void setGranjeroPropietario(Granjero granjeroPropietario) {
        this.granjeroPropietario = granjeroPropietario;
    }

    @Override
    public String toString() {

        return "AnimalGranja{" + "Propietario='" + granjeroPropietario.getNombre() + '\'' + ", tipo=" + Animal.nombresTipos.get(this.getTipo()) + ", raza='" + this.getRaza() + '}';

    }

}
