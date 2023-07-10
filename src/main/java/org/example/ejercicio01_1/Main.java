package org.example.ejercicio01_1;

import org.example.util.Input;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> listaNum = new ArrayList<>();
        Boolean continuar = true;
        Integer numConsola;
        int selCont;
        while (continuar) {
            numConsola = Input.integer("Que nuevo número quieres introduccir en tu lista?");
            listaNum.add(numConsola);
            selCont = Input.integer("Si quieres seguir añadiendo números introduce 1 por teclado, en caso contrario introduce 0");
            continuar = selCont == 1 ? true : false;
        }
        System.out.println("La lista final es: " + listaNum);
        List<Integer> numPares = listaNum.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Los numeros pares de tu lista son:" + numPares);


    }
}
