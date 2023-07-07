package org.example.ejercicio16;

import org.example.ejercicio13.clases.*;
import org.example.ejercicio14.clases.GetListaAnimalesCreada;
import org.example.ejercicio16.clases.GeneracionCrias;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] Args) {
        ArrayList<Animal> listaAnimales = new ArrayList<>();
        //lista con 2 animales de cada
        listaAnimales= GetListaAnimalesCreada.recuperarListaCreada1();
        ArrayList<Animal> listaCrias= new ArrayList<>();
        //obtenemos la primera generacion de crias
        listaCrias= GeneracionCrias.devulveListaCrias(listaAnimales,3);
        for(Animal i: listaCrias){
            System.out.println(i);
        }

    }

}