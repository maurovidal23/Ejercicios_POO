package org.example.ejercicio12.Main;

import org.example.ejercicio12.clases.*;

public class Main {

    public static void main (String[]Args){
        Gato g= new Gato("egipcia", "Firulais", "YoMismo");
        Oveja o = new Oveja("lanuda", "miAbuelo");
        Perro p =new Perro("Pastor Alemán", "Lucas", "Alex");
        PezPayaso pp=new PezPayaso("comun");
        Tucan t = new Tucan("caribeño");
        Vaca v = new Vaca("gallega", "Larsa");

        /* Como no esta el método toString definido en las clases dadas por los tipos se va a buscar el método
        toString de la clase más proxima que lo implemente. En este caso Mascota y AnimalGranja si implementan
        toString pero en el caso de AnimalSalvaje se va al toString de la clase Animal
         */

        System.out.println(g);
        System.out.println(o);
        System.out.println(p);
        System.out.println(pp);
        System.out.println(t);
        System.out.println(v);
    }
}
