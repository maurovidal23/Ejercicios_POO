package org.example.ejercicio14.clases;

import org.example.ejercicio13.clases.Mascota;

public class Perro extends Mascota implements ISexual{

    String sexo;
    public Perro(String raza, String nombre, String propietario, String sexo) {
        super(REINO.MAMIFERO, TIPO.PERRO, raza, MEDIO.TERRESTRE, nombre, propietario);
        this.sexo=sexo;
    }
    public Perro clone(){
        Perro p= new Perro(this.getRaza(),this.getNombre(),this.getPropietario(),this.sexo);
        return p;
    }

    public void reproducirSonido(){
        System.out.println("Guau");
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
