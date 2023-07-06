package org.example.ejercicio21;

import org.example.ejercicio13.clases.Animal;
import org.example.ejercicio20.LecturaArchivo;
import org.example.ejercicio21.clases.GenerarAbuelos;
import org.example.util.Input;

import java.util.ArrayList;

public class Main {

    public static void main (String[]Args){
        ArrayList<Animal> listaAnimales = new ArrayList<>();
        listaAnimales= LecturaArchivo.lerArchivo();
        int idSeleccionado= Input.integer("Introduce el valor del id del animal del cual quieres obtener su arbol genealogico");
        ArrayList<Animal> abuelos= new ArrayList<>();
        abuelos= GenerarAbuelos.generarAbuelos(idSeleccionado);
    }
}
