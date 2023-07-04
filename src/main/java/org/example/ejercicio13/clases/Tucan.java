package org.example.ejercicio13.clases;

import org.example.ejercicio13.clases.AnimalSalvaje;

public class Tucan extends AnimalSalvaje {

    public Tucan(String raza) {

        super(REINO.AVES,TIPO.TUCAN, raza, MEDIO.AEREO);
    }

    public Tucan clone(){
        Tucan t= new Tucan(this.getRaza());
        return t;
    }

    public void reproducirSonido(){
        System.out.println("graznido");
    }

    public void desplazamiento(){
        System.out.println("Vuela");
    }
}
