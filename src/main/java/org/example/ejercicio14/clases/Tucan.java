package org.example.ejercicio14.clases;

import org.example.ejercicio13.clases.AnimalSalvaje;

public class Tucan extends AnimalSalvaje implements ISexual {

    String sexo;
    public Tucan(String raza) {
        super(REINO.AVES,TIPO.TUCAN, raza, MEDIO.AEREO);
        this.sexo=sexo;
    }

    public Tucan clone(){
        Tucan t= new Tucan(this.getRaza());
        return t;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void reproducirSonido(){
        System.out.println("graznido");
    }

    public void desplazamiento(){
        System.out.println("Vuela");
    }
}
