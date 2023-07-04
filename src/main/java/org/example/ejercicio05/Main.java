package org.example.ejercicio05;

import org.example.util.Input;

public class Main {
    public static void main(String[] args) {

        double num = Input.real();
        int numParteEntera= (int)num;
        double numParteDecimal= num-numParteEntera;

        System.out.println("Separamos la parte entera y decimall de "+ num+ " de la siguiente forma: ");
        System.out.println("Parte entera: "+ numParteEntera);
        System.out.printf("Parte decimal: %.8f" , numParteDecimal);

    }
}
