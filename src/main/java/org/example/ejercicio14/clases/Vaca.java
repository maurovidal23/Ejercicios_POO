package org.example.ejercicio14.clases;
import org.example.ejercicio13.clases.AnimalGranja;

public class Vaca extends AnimalGranja implements ISexual {

    //private String sexo;
    private boolean masculino;
    public Vaca(String raza, String propietario,boolean sexo ) {
        super(REINO.MAMIFERO, TIPO.VACA, raza, MEDIO.TERRESTRE,propietario);
        this.masculino=sexo;
    }
    public Vaca clone(){
        Vaca v= new Vaca(this.getRaza(),this.getPropietario(),this.masculino);
        return v;
    }

    public void reproducirSonido(){
        System.out.println("Muuuu");
    }

    public void desplazamiento(){
        System.out.println("Desplazamiento 4 patas");
    }
/*
    @Override
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
}
