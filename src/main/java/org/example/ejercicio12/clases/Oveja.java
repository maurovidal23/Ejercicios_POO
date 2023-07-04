package org.example.ejercicio12.clases;

import org.example.ejercicio11.clases.AnimalGranja;

public class Oveja extends AnimalGranja {
    public Oveja(String raza, String propietario) {
        super(REINO.MAMIFERO, TIPO.OVEJA, raza, MEDIO.TERRESTRE, propietario);
    }
}
