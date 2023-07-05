package org.example.ejercicio13.clases;

import org.example.ejercicio14.clases.ISexual;

public class Gato extends Mascota implements ISexual {
    //private String sexo;


    public Gato( String raza,  boolean sexo, String nombre, String propietario) {
        super(REINO.MAMIFERO, TIPO.GATO, raza,  MEDIO.TERRESTRE, sexo, nombre, propietario);
    }

    public Gato(String raza, Animal padre, Animal madre, int generacion, boolean sexo, String nombre, String propietario) {
        super(REINO.MAMIFERO, TIPO.GATO, raza,  MEDIO.TERRESTRE, padre, madre, generacion, sexo, nombre, propietario);
    }



    public Gato clone() {
        Gato g = new Gato(this.getRaza(), this.isMasculino(),this.getNombre(), this.getPropietario());
        return g;
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
    public void reproducirSonido() {
        System.out.println("MIAU");
    }

    public void desplazamiento() {
        System.out.println("Desplazamiento 4 patas");
    }

}
