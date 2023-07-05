package org.example.ejercicio02;

import org.example.util.Input;

public class Main {
    public static void main(String[] args) {

        int num = Input.integer();

        System.out.print("El número " + num + " tiene por divisores primos del 1 al 10: ");

        if (num % 2 == 0) {
            System.out.print(2);
        }
        if (num % 3 == 0) {
            System.out.print("  " + 3);
        }
        if (num % 5 == 0) {
            System.out.print("  " + 5);
        }
        if (num % 7 == 0) {
            System.out.print("  " + 7);
        }
    }
}
