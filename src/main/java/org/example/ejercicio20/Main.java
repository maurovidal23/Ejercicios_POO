package org.example.ejercicio20;

import org.example.ejercicio13.clases.Animal;
import org.example.ejercicio20.clases.LecturaArchivo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] Args) {

        ArrayList<Animal> listaAnimales = new ArrayList<>();
        listaAnimales=LecturaArchivo.lerArchivo();
        /*
        A mayores se incluye en la clase LecturaArchivo una funcion que implementa la dependecia
        opencsv, la ejecución en este caso vendría dada por la siguiente sentencia:

        listaAnimales= LecturaArchivo.lerArchivoCSV();
         */
        for(Animal i:listaAnimales){
            System.out.println(i);
        }

    }
}
