package org.example.ejercicio14.clases;
import org.example.ejercicio13.clases.AnimalGranja;

public class Vaca extends AnimalGranja implements ISexual {

    private String sexo;
    public Vaca(String raza, String propietario,String sexo ) {
        super(REINO.MAMIFERO, TIPO.VACA, raza, MEDIO.TERRESTRE,propietario);
        this.sexo=sexo;
    }
    public Vaca clone(){
        Vaca v= new Vaca(this.getRaza(),this.getPropietario(),this.sexo);
        return v;
    }

    public void reproducirSonido(){
        System.out.println("Muuuu");
    }

    public void desplazamiento(){
        System.out.println("Desplazamiento 4 patas");
    }

    @Override
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
