package org.example.ejercicio12.clases;

import org.example.ejercicio11.clases.AnimalGranja;

public class Vaca extends AnimalGranja {
    public Vaca(String raza, String propietario) {
        super(REINO.MAMIFERO, TIPO.VACA, raza, MEDIO.TERRESTRE, propietario);
    }
}
