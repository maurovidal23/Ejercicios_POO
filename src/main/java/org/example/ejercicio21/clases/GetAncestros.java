package org.example.ejercicio21.clases;

import org.example.ejercicio13.clases.Animal;

import java.util.ArrayList;
import java.util.Map;

public class GetAncestros {

    public static ArrayList<Animal> getAncestros(Animal animal) {
        ArrayList<Animal> ancestros = new ArrayList<>();
        if(animal.getIdPadre()!=0){
            ancestros.add(animal.getPadre());
            ArrayList<Animal> temp=getAncestros(animal.getPadre());
            ancestros.addAll(temp);

        }
        if(animal.getIdMadre()!=0){
            ancestros.add(animal.getMadre());
            ancestros.addAll(getAncestros(animal.getMadre()));
        }

        return ancestros;

    }

}