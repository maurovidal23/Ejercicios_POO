package org.example.ejercicio15;

import org.example.ejercicio13.clases.*;
import org.example.ejercicio14.clases.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[]Args){
        ArrayList<Animal> arcaNoe= new ArrayList<>();
        arcaNoe=GetListaAnimalesCreada.recuperarListaCreada1();

        //DEFINICION DE LAS LISTAS
        ArrayList<AnimalGranja> listaAnimalesGranja= new ArrayList<>();
        ArrayList<Mascota> listaMascota= new ArrayList<>();
        ArrayList<AnimalSalvaje> listaAnimalSalvaje= new ArrayList<>();
        //clasificación

        for(Animal i: arcaNoe){
            if(i instanceof Mascota){
                listaMascota.add((Mascota) i);
            }
            if(i instanceof AnimalSalvaje){
                listaAnimalSalvaje.add((AnimalSalvaje) i);
            }
            if(i instanceof AnimalGranja){
                listaAnimalesGranja.add((AnimalGranja) i);
            }
        }
        /*
        for(int i =0; i<arcaNoe.size();i++){
            if(arcaNoe.get(i).getTipo()== Animal.TIPO.GATO){
                listaMascota.add((Mascota) arcaNoe.get(i));
            }
            if (arcaNoe.get(i).getTipo()== Animal.TIPO.PERRO){
                listaMascota.add((Mascota) arcaNoe.get(i));
            }
            if (arcaNoe.get(i).getTipo()== Animal.TIPO.OVEJA){
                listaAnimalesGranja.add((AnimalGranja) arcaNoe.get(i));
            }
            if (arcaNoe.get(i).getTipo()== Animal.TIPO.VACA){
                listaAnimalesGranja.add((AnimalGranja) arcaNoe.get(i));
            }
            if (arcaNoe.get(i).getTipo()== Animal.TIPO.TUCAN){
                listaAnimalSalvaje.add((AnimalSalvaje) arcaNoe.get(i));
            }
            if (arcaNoe.get(i).getTipo()== Animal.TIPO.TUCAN){
                listaAnimalSalvaje.add((AnimalSalvaje) arcaNoe.get(i));
            }
        }

         */



        System.out.println("La lista de mascotas esta formada por :" + listaMascota.toString());
        System.out.println("La lista de animales de granja esta formada por: " + listaAnimalesGranja.toString());
        System.out.println("La lista de animal salvajes esta formada por:" + listaAnimalSalvaje);

    }
}
