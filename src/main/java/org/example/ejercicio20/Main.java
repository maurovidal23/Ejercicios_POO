package org.example.ejercicio20;

import org.example.ejercicio13.clases.Animal;
import org.example.ejercicio20.clases.LecturaArchivo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] Args) {

        ArrayList<Animal> listaAnimales = new ArrayList<>();
        listaAnimales= LecturaArchivo.lerArchivo();
        for(Animal i:listaAnimales){
            System.out.println(i);
        }

    }
}
