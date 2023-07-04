package org.example.ejercicio12.clases;

import org.example.ejercicio11.clases.AnimalSalvaje;

public class PezPayaso extends AnimalSalvaje {
    public PezPayaso(String raza) {
        super(REINO.PECES, TIPO.PEZ_PAYASO, raza, MEDIO.ACUÁTICO);
    }
}
