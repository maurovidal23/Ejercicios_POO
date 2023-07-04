package org.example.ejercicio14.clases;

import org.example.ejercicio13.clases.AnimalGranja;

public class Oveja extends AnimalGranja implements ISexual{
    private String sexo;
    public Oveja(String raza, String propietario,String sexo) {
        super(REINO.MAMIFERO, TIPO.OVEJA, raza, MEDIO.TERRESTRE, propietario);
        this.sexo=sexo;
    }

    public Oveja clone(){
        Oveja o= new Oveja(this.getRaza(),this.getPropietario(),this.sexo);
        return o;
    }

    public void reproducirSonido(){
        System.out.println("Beee");
    }

    public void desplazamiento(){
        System.out.println("Desplazamiento 4 patas");
    }

    @Override
    public String getSexo() {
        return sexo;
    }

    @Override
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
