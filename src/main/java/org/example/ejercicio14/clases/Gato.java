package org.example.ejercicio14.clases;
import org.example.ejercicio13.clases.Mascota;

public class Gato extends Mascota implements ISexual{
    private String sexo;


    public Gato(String raza, String nombre, String propietario, String sexo) {
        super(REINO.MAMIFERO, TIPO.GATO, raza, MEDIO.TERRESTRE, nombre, propietario);
        this.sexo=sexo;
    }



    public Gato clone(){
        Gato g=new Gato(this.getRaza(),this.getNombre(),this.getPropietario(),this.sexo);
        return g;
    }

    @Override
    public String getSexo() {
        return sexo;
    }

    @Override
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void reproducirSonido(){
        System.out.println("MIAU");
    }

    public void desplazamiento(){
        System.out.println("Desplazamiento 4 patas");
    }

}
