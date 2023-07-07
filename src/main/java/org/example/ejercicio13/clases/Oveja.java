package org.example.ejercicio13.clases;

import org.example.ejercicio13.clases.AnimalGranja;
import org.example.ejercicio22.clases.Granjero;

public class Oveja extends AnimalGranja {

    public Oveja(String raza,  Animal padre, Animal madre, int generacion, boolean sexo, String propietario) {
        super(REINO.MAMIFERO, TIPO.OVEJA, raza,  MEDIO.TERRESTRE, padre, madre, generacion, sexo, propietario);
    }

    public Oveja(String raza, boolean sexo, String propietario) {
        super(REINO.MAMIFERO, TIPO.OVEJA, raza, MEDIO.TERRESTRE, sexo, propietario);
    }

    public Oveja( String raza, boolean sexo, Granjero propietario) {
        super(REINO.MAMIFERO, TIPO.OVEJA, raza, MEDIO.TERRESTRE, sexo, propietario);
    }

    public Oveja(String raza, Animal padre, Animal madre, int generacion, boolean sexo, Granjero propietario) {
        super(REINO.MAMIFERO, TIPO.OVEJA, raza, MEDIO.TERRESTRE, padre, madre, generacion, sexo, propietario);
    }

    public Oveja clone(){
        Oveja o= new Oveja(this.getRaza(),this.isMasculino(),this.getPropietario());
        return o;
    }

    public void reproducirSonido(){
        System.out.println("Beee");
    }

    public void desplazamiento(){
        System.out.println("Desplazamiento 4 patas");
    }
}
