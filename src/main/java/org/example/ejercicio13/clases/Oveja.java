package org.example.ejercicio13.clases;

import org.example.ejercicio13.clases.AnimalGranja;

public class Oveja extends AnimalGranja {
    public Oveja(String raza, String propietario) {
        super(REINO.MAMIFERO, TIPO.OVEJA, raza, MEDIO.TERRESTRE, propietario);
    }

    public Oveja clone(){
        Oveja o= new Oveja(this.getRaza(),this.getPropietario());
        return o;
    }

    public void reproducirSonido(){
        System.out.println("Beee");
    }

    public void desplazamiento(){
        System.out.println("Desplazamiento 4 patas");
    }
}
