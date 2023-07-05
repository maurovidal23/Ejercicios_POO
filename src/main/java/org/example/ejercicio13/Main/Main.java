package org.example.ejercicio13.Main;

import org.example.ejercicio10.clase.Animal;
import org.example.ejercicio13.clases.Gato;

import java.util.ArrayList;

public class Main {
    public static void main (String[]Args){
        Gato g = new Gato("persa",false,"Paco","Yo");
        g.reproducirSonido();
        g.desplazamiento();
    }
}
