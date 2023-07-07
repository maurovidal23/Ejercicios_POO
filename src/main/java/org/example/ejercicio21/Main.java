package org.example.ejercicio21;

import org.example.ejercicio13.clases.Animal;
import org.example.ejercicio20.clases.LecturaArchivo;
import org.example.ejercicio21.clases.GetAncestros;
import org.example.util.Input;

import java.util.ArrayList;
import java.util.Map;

public class Main {

    public static void main (String[]Args){
        ArrayList<Animal> listaAnimales = new ArrayList<>();
        listaAnimales= LecturaArchivo.lerArchivo();
        int idSeleccionado= Input.integer("Introduce el valor del id del animal del cual quieres obtener su arbol genealogico");
        ArrayList<Animal> abuelos= new ArrayList<>();
        Map<Integer,Animal> listaRefAnimales= Animal.getIdAnimalRef();
        Animal a= listaAnimales.get(idSeleccionado);
        abuelos=GetAncestros.getAncestros(a);
        System.out.println(a.getGeneracion());
        for(Animal i: abuelos){
            System.out.println(i);
        }
    }
}
