package org.example.ejercicio14.clases;

import org.example.ejercicio13.clases.AnimalSalvaje;

public class Tucan extends AnimalSalvaje implements ISexual {

    //String sexo;
    private boolean masculino;
    public Tucan(String raza,boolean sexo) {
        super(REINO.AVES,TIPO.TUCAN, raza, MEDIO.AEREO);
        this.masculino=sexo;
    }

    public Tucan clone(){
        Tucan t= new Tucan(this.getRaza(),this.masculino);
        return t;
    }
/*
    public String getSexo() {
        return sexo;
    }

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

    public void reproducirSonido(){
        System.out.println("graznido");
    }

    public void desplazamiento(){
        System.out.println("Vuela");
    }
}
