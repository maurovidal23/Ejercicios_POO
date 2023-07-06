package org.example.ejercicio20;

import org.example.ejercicio13.clases.Animal;
import org.example.ejercicio13.clases.Gato;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] Args) {

        ArrayList<Animal> listaAnimales = new ArrayList<>();
        listaAnimales=LecturaArchivo.lerArchivo();
        System.out.println(listaAnimales);

    }
}
