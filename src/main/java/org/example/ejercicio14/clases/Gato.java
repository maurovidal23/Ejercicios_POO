package org.example.ejercicio14.clases;
import org.example.ejercicio13.clases.Mascota;

public class Gato extends Mascota implements ISexual{
    //private String sexo;
    private boolean masculino;

    public boolean isMasculino() {
        return masculino;
    }

    public void setMasculino(boolean sexo) {
        masculino = sexo;
    }

    public Gato(String raza, String nombre, String propietario, Boolean sexo) {
        super(REINO.MAMIFERO, TIPO.GATO, raza, MEDIO.TERRESTRE, nombre, propietario);
        this.masculino=sexo;
    }



    public Gato clone(){
        Gato g=new Gato(this.getRaza(),this.getNombre(),this.getPropietario(),this.masculino);
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
    public void reproducirSonido(){
        System.out.println("MIAU");
    }

    public void desplazamiento(){
        System.out.println("Desplazamiento 4 patas");
    }

}
