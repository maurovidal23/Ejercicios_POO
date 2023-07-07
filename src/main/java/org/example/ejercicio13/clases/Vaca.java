package org.example.ejercicio13.clases;

import org.example.ejercicio13.clases.AnimalGranja;
import org.example.ejercicio22.clases.Granjero;

public class Vaca extends AnimalGranja {


    public Vaca(String raza, boolean sexo, String propietario) {
        super(REINO.MAMIFERO, TIPO.VACA, raza,  MEDIO.TERRESTRE, sexo, propietario);
    }

    public Vaca(String raza,Animal padre, Animal madre, int generacion, boolean sexo, String propietario) {
        super(REINO.MAMIFERO, TIPO.VACA, raza, MEDIO.TERRESTRE, padre, madre, generacion, sexo, propietario);
    }

    public Vaca(String raza, boolean sexo, Granjero propietario) {
        super(REINO.MAMIFERO, TIPO.VACA, raza,MEDIO.TERRESTRE, sexo, propietario);
    }

    public Vaca( String raza,  Animal padre, Animal madre, int generacion, boolean sexo, Granjero propietario) {
        super(REINO.MAMIFERO, TIPO.VACA, raza,MEDIO.TERRESTRE, padre, madre, generacion, sexo, propietario);
    }

    public Vaca clone(){
        Vaca v= new Vaca(this.getRaza(),this.isMasculino(),this.getPropietario());
        return v;
    }

    public void reproducirSonido(){
        System.out.println("Muuuu");
    }

    public void desplazamiento(){
        System.out.println("Desplazamiento 4 patas");
    }
}
