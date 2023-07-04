package org.example.ejercicio13.clases;

import org.example.ejercicio13.clases.Mascota;

public class Perro extends Mascota {

    public Perro(String raza, String nombre, String propietario) {
        super(REINO.MAMIFERO, TIPO.PERRO, raza, MEDIO.TERRESTRE, nombre, propietario);
    }
    public Perro clone(){
        Perro p= new Perro(this.getRaza(),this.getNombre(),this.getPropietario());
        return p;
    }

    public void reproducirSonido(){
        System.out.println("Guau");
    }

    public void desplazamiento(){
        System.out.println("Desplazamiento 4 patas");
    }
}
