package org.example.ejercicio06;

import java.util.ArrayList;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random random= new Random();
        int max=1;
        int min= 10;
        int numeroSalidas=random.nextInt(max+min)+min;


        ArrayList<Integer> fibonacci= new ArrayList<Integer>();

        for(int i=0; i<numeroSalidas;i++){
            if(i==0){
                fibonacci.add(1);
            }else if(i==1){
                fibonacci.add(1);
            }else {
                fibonacci.add(fibonacci.get(i - 1) + fibonacci.get(i - 2));
            }
        }
        System.out.println(fibonacci);
    }
}
