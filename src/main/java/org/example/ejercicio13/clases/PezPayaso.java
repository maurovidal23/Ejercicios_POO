package org.example.ejercicio13.clases;

import org.example.ejercicio13.clases.AnimalSalvaje;

public class PezPayaso extends AnimalSalvaje {
    public PezPayaso(String raza, boolean sexo) {
        super(REINO.PECES, TIPO.PEZ_PAYASO, raza, MEDIO.ACUÁTICO, sexo);
    }


    public PezPayaso(String raza, Animal padre, Animal madre, int generacion, boolean sexo) {
        super(REINO.PECES, TIPO.PEZ_PAYASO, raza, MEDIO.ACUÁTICO, padre, madre, generacion, sexo);
    }

    public PezPayaso clone() {
        PezPayaso pp = new PezPayaso(this.getRaza(),this.isMasculino());
        return pp;
    }

    public void reproducirSonido() {
        System.out.println("");
    }

    public void desplazamiento() {
        System.out.println("Nadando");
    }
}
