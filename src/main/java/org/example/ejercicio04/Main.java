package org.example.ejercicio04;

import org.example.util.Input;

public class Main {

    public static void main(String [] Args ){
        int num = Input.integer();
        int factorialNum=1;
        for(int i=1; i<=num;i++){
            factorialNum*=i;
        }

        System.out.println("El factorial de " + num + " es: "+ factorialNum);
    }
}
