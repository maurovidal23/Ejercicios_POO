package org.example.ejercicio13.clases;

import org.example.ejercicio13.clases.AnimalGranja;

public class Vaca extends AnimalGranja {
    public Vaca(String raza, String propietario) {
        super(REINO.MAMIFERO, TIPO.VACA, raza, MEDIO.TERRESTRE, propietario);
    }
    public Vaca clone(){
        Vaca v= new Vaca(this.getRaza(),this.getPropietario());
        return v;
    }

    public void reproducirSonido(){
        System.out.println("Muuuu");
    }

    public void desplazamiento(){
        System.out.println("Desplazamiento 4 patas");
    }
}
