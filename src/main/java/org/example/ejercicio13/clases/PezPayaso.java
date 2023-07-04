package org.example.ejercicio13.clases;

import org.example.ejercicio13.clases.AnimalSalvaje;

public class PezPayaso extends AnimalSalvaje {
    public PezPayaso(String raza) {

        super(REINO.PECES, TIPO.PEZ_PAYASO, raza, MEDIO.ACUÁTICO);
    }
    public PezPayaso clone(){
        PezPayaso pp= new PezPayaso(this.getRaza());
        return pp;
    }

    public void reproducirSonido(){
        System.out.println("");
    }

    public void desplazamiento(){
        System.out.println("Nadando");
    }
}
