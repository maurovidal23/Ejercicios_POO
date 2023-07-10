package org.example.ejercicio03_1;

import org.example.util.Input;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Integer num= Input.integer("Introduce un número entero");
        //static IntStream range( int startInclusive, int endExclusive)
        IntStream i= IntStream.range(1,num);

        //calculo del máximo divisor distinto de si mismo

        OptionalInt masDiv = i.filter(x->num%x==0).reduce((a, b)->a>b?a:b);
        System.out.println(masDiv);
    }
}
