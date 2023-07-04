package org.example.ejercicio12.clases;

import org.example.ejercicio11.clases.Mascota;

public class Gato extends Mascota {
    public Gato(String raza, String nombre, String propietario) {
        super(REINO.MAMIFERO, TIPO.GATO, raza, MEDIO.TERRESTRE, nombre, propietario);
    }

}
