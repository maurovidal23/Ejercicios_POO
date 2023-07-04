package org.example.ejercicio07;

public class Main {
    public static void main(String[] args) {
        int num=5;
        imprimirValor(num);
        double num2=3.14;
        imprimirValor(num2);
        char c= 'd';
        imprimirValor(c);
        String s = "Kepa";
        imprimirValor(s);


    }

    public static void imprimirValor(int num){
        System.out.println("El entero es: " + num);
    }

    public static void imprimirValor(double num){
        System.out.println("El flotante es: " + num);
    }

    public static void imprimirValor(char c){
        System.out.println("El caracter es:" + c);
    }

    public static void imprimirValor(String s){
        System.out.println("La cadena de texto tiene el valor: " + s);
    }


}
