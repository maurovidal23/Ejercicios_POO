package org.example.ejercicio17;
import org.example.ejercicio13.clases.*;
import org.example.ejercicio14.clases.GetListaAnimalesCreada;
import org.example.ejercicio16.clases.GeneracionCrias;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] Args) {
        ArrayList<Animal> listaAnimales = new ArrayList<>();
        listaAnimales=GetListaAnimalesCreada.recuperarListaCreada3();
        ArrayList<Animal> listaCrias= new ArrayList<>();
        listaCrias= GeneracionCrias.devulveListaCrias(listaAnimales,2);
        listaCrias=GeneracionCrias.devulveListaCrias(listaCrias,2);
        listaCrias=GeneracionCrias.devulveListaCrias(listaCrias,2);
        listaCrias=GeneracionCrias.devulveListaCrias(listaCrias,2);
        salidaConsolaTablaGeneraciones(listaCrias);



    }
   public static void salidaConsolaTablaGeneraciones(ArrayList<Animal> listaAnimales){
       int indexGen0 = 0;
       int indexGen1 = 0;
       int indexGen2 = 0;
       int indexGen3 = 0;
       int indexGen4 = 0;
       int numCriasmax = 0;
       for (Animal i : listaAnimales) {
           if (i.getGeneracion() == 1) {
               indexGen0++;
           } else if (i.getGeneracion() == 2) {
               indexGen1++;
           } else if (i.getGeneracion() == 3) {
               indexGen2++;
           } else if (i.getGeneracion() == 4) {
               indexGen3++;
           } else if (i.getGeneracion() == 5) {
               indexGen4++;
           }

           if (i.getNumeroCrias() > numCriasmax) {
               numCriasmax = i.getNumeroCrias();
           }
       }
       System.out.println("Num animales iniciales: " + indexGen0);
       System.out.println("Num animales 1ª generacion: " + indexGen1);
       System.out.println("Num animales 2ª generacion: " + indexGen2);
       System.out.println("Num animales 3º generacion: " + indexGen3);
       System.out.println("Num animales 4º generacion: " + indexGen4);
   }

}