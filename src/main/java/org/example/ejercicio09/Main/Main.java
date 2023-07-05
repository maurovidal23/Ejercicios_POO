package org.example.ejercicio09.Main;

import org.example.ejercicio09.clases.Animal;

public class Main {
    public static void main(String[] args) {

        Animal n1= new Animal(Animal.REINO.ANFIBIOS, Animal.TIPO.CANARIO,"Cantarin", Animal.MEDIO.AEREO);
        System.out.println(n1);
    }
}
