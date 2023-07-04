package org.example.ejercicio14;

import org.example.ejercicio14.clases.*;
import org.example.ejercicio13.clases.Animal;

import java.util.ArrayList;

public class Main {
    public static void main (String[]Args){
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

        /*
        En el print se hace uso de los metodos toString que no estan definidos para cada una
        de las clases de los tipos de animales así que no hace uso del atributo sexo, pero
        para ver visualmente como esta constituida la lista creo que es suficiente
         */
        System.out.println(arcaNoe);

    }
}
