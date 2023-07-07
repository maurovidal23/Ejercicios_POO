package org.example.ejercicio22.clases;

import org.example.ejercicio13.clases.Animal;
import org.example.ejercicio13.clases.AnimalGranja;

import java.util.HashMap;
import java.util.Map;

public class Granjero {
    private String nombre;
    private static int idGranjeros=0;
    private int id;
    private static Map<Integer, AnimalGranja> mapaRefIdGranjeroAnimal;

    public Granjero(String nombre) {
        this.nombre = nombre;
        this.id=generarId();
    }
    public int generarId(){
        idGranjeros++;
        return idGranjeros;
    }

    public static void añadirAnimal(Granjero granjero, AnimalGranja animal){
        if(Granjero.mapaRefIdGranjeroAnimal==null){
            Granjero.mapaRefIdGranjeroAnimal= new HashMap<>();
        }
        Granjero.mapaRefIdGranjeroAnimal.put(granjero.getId(),animal);

    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Map<Integer, AnimalGranja> getMapaRefIdGranjeroAnimal() {
        return mapaRefIdGranjeroAnimal;
    }

    public void setMapaRefIdGranjeroAnimal(Map<Integer, AnimalGranja> mapaRefIdGranjeroAnimal) {
        this.mapaRefIdGranjeroAnimal = mapaRefIdGranjeroAnimal;
    }
}
