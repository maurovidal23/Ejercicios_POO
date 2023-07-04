package org.example.ejercicio03;

import org.example.util.Input;

public class Main {

    public static void main(String [] Args){

        int num = Input.integer();

        System.out.print("Los divisores de " + num + " son: ");
        for(int i=1;i<num;i++){
            if(num%i==0){
                System.out.print(i + ",");
            }
        }
        System.out.print(num);

    }

}
