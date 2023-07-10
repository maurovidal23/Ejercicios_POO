package org.example.ejercicio02_1;

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

        List<Integer> divTres= listaNum.stream()
                .filter(x->x%3==0)
                .collect(Collectors.toList());
        List<Integer> divCinco= listaNum.stream()
                .filter(x->x%5==0)
                .collect(Collectors.toList());
        List<Integer> divSiete=listaNum.stream()
                .filter(x->x%7==0)
                .collect(Collectors.toList());
    }
}
