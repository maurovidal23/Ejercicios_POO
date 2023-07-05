package org.example.ejercicio13.clases;

import org.example.ejercicio13.clases.AnimalSalvaje;

public class Tucan extends AnimalSalvaje {



    public Tucan( String raza,boolean sexo) {
        super(REINO.AVES,TIPO.TUCAN, raza,MEDIO.AEREO, sexo);
    }

    public Tucan( String raza, Animal padre, Animal madre, int generacion, boolean sexo) {
        super(REINO.AVES,TIPO.TUCAN, raza, MEDIO.AEREO, padre, madre, generacion, sexo);
    }

    public Tucan clone(){
        Tucan t= new Tucan(this.getRaza(),this.isMasculino());
        return t;
    }

    public void reproducirSonido(){
        System.out.println("graznido");
    }

    public void desplazamiento(){
        System.out.println("Vuela");
    }
}
