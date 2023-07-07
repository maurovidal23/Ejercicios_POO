package org.example.ejercicio18;

import org.example.ejercicio13.clases.Animal;
import org.example.ejercicio13.clases.Gato;
import org.example.ejercicio14.clases.GetListaAnimalesCreada;

import java.util.ArrayList;

public class Main {
    public static void main(String[] Args) {
        ArrayList<Animal> listaAnimales = new ArrayList<>();
        listaAnimales= GetListaAnimalesCreada.recuperarListaCreada2();

        for(Animal i: listaAnimales){
            System.out.println(i.toString()+i.getId());
        }

    }
}
