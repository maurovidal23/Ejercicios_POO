package org.example.ejercicioEXTRA;

import org.example.ejercicio13.clases.Animal;
import org.example.ejercicio14.clases.GetListaAnimalesCreada;
import org.example.ejercicio16.clases.GeneracionCrias;
import org.example.ejercicioEXTRA.clases.UsoDependenciaJSON;

import java.util.ArrayList;

public class Main {
    public static void main(String[] Args) {

        ArrayList<Animal> listaAnimales = new ArrayList<>();
        listaAnimales= GetListaAnimalesCreada.recuperarListaCreada3();
        ArrayList<Animal> listaCrias= new ArrayList<>();
        listaCrias= GeneracionCrias.devulveListaCrias(listaAnimales,2);
        listaCrias=GeneracionCrias.devulveListaCrias(listaCrias,2);

        UsoDependenciaJSON.generarJSON(listaCrias);

    }
}
