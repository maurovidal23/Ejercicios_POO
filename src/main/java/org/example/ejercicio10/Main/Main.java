package org.example.ejercicio10.Main;

import org.example.ejercicio10.clase.Animal;

public class Main {
    public static void main(String[] args) {

        Animal n1 = new Animal(Animal.REINO.AVES, Animal.TIPO.CANARIO,"Cantarin", Animal.MEDIO.TERRESTRE);
        Animal n2 =new Animal(n1);
        Animal n3= n1.clone();

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
    }
}
