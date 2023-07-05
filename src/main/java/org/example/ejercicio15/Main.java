package org.example.ejercicio15;

import org.example.ejercicio13.clases.Animal;
import org.example.ejercicio13.clases.AnimalGranja;
import org.example.ejercicio13.clases.AnimalSalvaje;
import org.example.ejercicio13.clases.Mascota;
import org.example.ejercicio14.clases.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[]Args){
        ArrayList<Animal> arcaNoe= new ArrayList<>();
        Gato g_mas= new Gato("persa","Firulais","Noe",true);
        arcaNoe.add(g_mas);
        Gato g_fem=new Gato("persa", "María","Noe",false);
        arcaNoe.add(g_fem);
        Oveja o_mas= new Oveja("lanuda","Noe",true);
        arcaNoe.add(o_mas);
        Oveja o_fem= new Oveja("lanuda","Noe",false);
        arcaNoe.add(o_fem);
        Perro p_mas=new Perro("labrador","Lucas","Noe",true);
        arcaNoe.add(p_mas);
        Perro p_fem=new Perro("labrador","Espe","Noe", false);
        arcaNoe.add(p_fem);
        PezPayaso pp_mas= new PezPayaso("comun",true);
        arcaNoe.add(pp_mas);
        PezPayaso pp_fem=new PezPayaso("comun",false);
        Tucan t_mas=new Tucan("amazonico",true);
        arcaNoe.add(t_mas);
        Tucan t_fem= new Tucan("amazonico",false);
        arcaNoe.add(t_fem);
        Vaca v_mas=new Vaca("gallega", "Noe", true);
        arcaNoe.add(v_mas);
        Vaca v_fem= new Vaca("gallega","Noe",false);
        arcaNoe.add(v_fem);

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
