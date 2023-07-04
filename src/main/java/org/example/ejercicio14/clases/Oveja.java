package org.example.ejercicio14.clases;

import org.example.ejercicio13.clases.AnimalGranja;

public class Oveja extends AnimalGranja implements ISexual{
    //private String sexo;
    private boolean masculino;
    public Oveja(String raza, String propietario,boolean sexo) {
        super(REINO.MAMIFERO, TIPO.OVEJA, raza, MEDIO.TERRESTRE, propietario);
        this.masculino=sexo;
    }

    public Oveja clone(){
        Oveja o= new Oveja(this.getRaza(),this.getPropietario(),this.masculino);
        return o;
    }

    public void reproducirSonido(){
        System.out.println("Beee");
    }

    public void desplazamiento(){
        System.out.println("Desplazamiento 4 patas");
    }
/*
    @Override
    public String getSexo() {
        return sexo;
    }

    @Override
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    */

    @Override
    public boolean isMasculino() {
        return masculino;
    }

    @Override
    public void setMasculino(boolean masculino) {
        this.masculino = masculino;
    }
}
