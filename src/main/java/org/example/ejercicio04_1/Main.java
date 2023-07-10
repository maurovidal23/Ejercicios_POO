package org.example.ejercicio04_1;

import org.example.util.Input;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Integer numUsuario= Input.integer("Introduce el número del cual quieres calcular el factorial");
        //static IntStream range( int startInclusive, int endExclusive)
        IntStream i= IntStream.range(1,numUsuario+1);
        OptionalInt factorial= i.reduce((acc,cur)->acc*cur);
        System.out.println(factorial);
    }
}
