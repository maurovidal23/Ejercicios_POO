package org.example.ejercicio14.main;

import org.example.ejercicio13.clases.*;
import org.example.ejercicio13.clases.Animal;
import org.example.ejercicio14.clases.GetListaAnimalesCreada;

import java.util.ArrayList;

public class Main {
    public static void main (String[]Args){
        ArrayList<Animal> arcaNoe= new ArrayList<>();
        arcaNoe= GetListaAnimalesCreada.recuperarListaCreada1();

        /*
        En el print se hace uso de los metodos toString que no estan definidos para cada una
        de las clases de los tipos de animales así que no hace uso del atributo sexo, pero
        para ver visualmente como esta constituida la lista creo que es suficiente
         */
        System.out.println(arcaNoe);

    }
}
