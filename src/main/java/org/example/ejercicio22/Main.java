package org.example.ejercicio22;

import org.example.ejercicio13.clases.Animal;
import org.example.ejercicio13.clases.AnimalGranja;
import org.example.ejercicio13.clases.Vaca;
import org.example.ejercicio16.clases.GeneracionCrias;
import org.example.ejercicio22.clases.Granjero;

import javax.security.auth.login.AccountNotFoundException;
import java.util.ArrayList;

public class Main {
    public static void main(String[]Args){
        Granjero gr1= new Granjero("Pepe");
        Granjero gr2= new Granjero("Juan");
        Vaca v_mas= new Vaca("gallega",true,gr1);
        Vaca v_fem= new Vaca("gallega", false,gr2);
        ArrayList<Animal> listaVacas= new ArrayList<>();
        listaVacas.add(v_fem);
        listaVacas.add(v_mas);
        int maxCrias=4;
        listaVacas= GeneracionCrias.devulveListaCrias(listaVacas,maxCrias);
        for(Animal i : listaVacas){
            System.out.println(i);
        }
    }
}
