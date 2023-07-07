package org.example.ejercicio13.clases;

import org.example.ejercicio13.clases.Animal;
import org.example.ejercicio11.clases.IPropietario;

public abstract class Mascota extends Animal implements IPropietario {
    String Nombre;
    String Propietario;

    public Mascota(REINO reino, TIPO tipo, String raza, MEDIO medio, boolean sexo, String nombre, String propietario) {
        super(reino, tipo, raza, medio, sexo);
        Nombre = nombre;
        Propietario = propietario;
    }


    public Mascota(REINO reino, TIPO tipo, MEDIO medio, boolean masculino, Animal padre, Animal madre, int generacion, int id, String nombre, String propietario) {
        super(reino, tipo, medio, masculino, padre, madre, generacion, id);
        Nombre = nombre;
        Propietario = propietario;
    }

    public Mascota(REINO reino, TIPO tipo, MEDIO medio, boolean masculino, int idPadre, int idMadre, int generacion, int id, String nombre, String propietario) {
        super(reino, tipo, medio, masculino, idPadre, idMadre, generacion, id);
        Nombre = nombre;
        Propietario = propietario;
    }

    public Mascota(REINO reino, TIPO tipo, String raza, boolean sexo, String nombre, String propietario) {
        super(reino, tipo, raza, sexo);
        Nombre = nombre;
        Propietario = propietario;
    }

    public Mascota(REINO reino, TIPO tipo, String raza, MEDIO medio, Animal padre, Animal madre, int generacion, boolean sexo, String nombre, String propietario) {
        super(reino, tipo, raza, medio, padre, madre, generacion, sexo);
        Nombre = nombre;
        Propietario = propietario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    @Override
    public String getPropietario() {
        return Propietario;
    }

    public void setPropietario(String propietario) {
        Propietario = propietario;
    }


    @Override
    public String toString() {
        return "Mascota{" +
                "Nombre='" + Nombre + '\'' +
                "Id='" + this.getId() + '\'' +
                "Tipo='" + this.getTipo() + '\'' +
                '}';
    }
}
