package org.example.ejercicio13.clases;

import org.example.ejercicio10.clase.Animal;
import org.example.ejercicio13.clases.Mascota;

public class Gato extends Mascota {
    public Gato(String raza, String nombre, String propietario) {
        super(REINO.MAMIFERO, TIPO.GATO, raza, MEDIO.TERRESTRE, nombre, propietario);
    }

    public Gato clone(){
        Gato g=new Gato(this.getRaza(),this.getNombre(),this.getPropietario());
        return g;
    }

    public void reproducirSonido(){
        System.out.println("MIAU");
    }

    public void desplazamiento(){
        System.out.println("Desplazamiento 4 patas");
    }

}
