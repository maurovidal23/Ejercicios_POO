package org.example.ejercicio11.Main;

import org.example.ejercicio10.clase.Animal;
import org.example.ejercicio11.clases.AnimalGranja;
import org.example.ejercicio11.clases.Mascota;

public class Main {
    public static void main(String[] args) {
        Mascota m1= new Mascota(Animal.REINO.MAMIFERO, Animal.TIPO.GATO, "Egipcio", Animal.MEDIO.TERRESTRE,"Juan","Yo");
        AnimalGranja g1= new AnimalGranja(Animal.REINO.AVES, Animal.TIPO.CANARIO,"Cantaor", Animal.MEDIO.AEREO,"Yo");

        System.out.println(m1);
        System.out.println(g1);
    }
}
