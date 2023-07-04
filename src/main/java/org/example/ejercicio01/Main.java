package org.example.ejercicio01;

import org.example.util.Input;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class Main {
    public static void main(String[] args) {

        int a = Input.integer();

        if(a%2==0){
            System.out.println("El número " + a + " es par");
        }else{
            System.out.println("El número " + a + " es impar");
        }
    }
}
