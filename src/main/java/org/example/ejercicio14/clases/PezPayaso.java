package org.example.ejercicio14.clases;

import org.example.ejercicio13.clases.AnimalSalvaje;

public class PezPayaso extends AnimalSalvaje implements ISexual {
    String sexo;
    public PezPayaso(String raza,String sexo) {
        super(REINO.PECES, TIPO.PEZ_PAYASO, raza, MEDIO.ACUÁTICO);
        this.sexo=sexo;
    }
    public PezPayaso clone(){
        PezPayaso pp= new PezPayaso(this.getRaza(),this.sexo);
        return pp;
    }

    public void reproducirSonido(){
        System.out.println("");
    }

    public void desplazamiento(){
        System.out.println("Nadando");
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
