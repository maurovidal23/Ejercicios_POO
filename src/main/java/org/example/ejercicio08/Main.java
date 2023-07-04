package org.example.ejercicio08;

import org.example.util.Input;

import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> lista=new ArrayList<Double>();
        lista.add(3.1415);
        lista.add(2.71828);
        lista.add(1.618);

        boolean entrada_correcta=false;
        int seleccion=0;
        while(entrada_correcta==false){
            seleccion=Input.integer("A continuación introduce el número entero que hace referencia a la selección que le interesa: 1->a ; 2->b; 3->c");
            if(seleccion==1 || seleccion==2|| seleccion==3){
                entrada_correcta=true;
            }
        }


        if(seleccion==1){
            metodoA(lista);
        }
        if (seleccion==2){
            metodoB(lista);
        }
        if(seleccion==3){
            metodoC(lista);
        }
        System.out.println(lista);
    }

    public static ArrayList<Double> metodoA (ArrayList<Double> lista){
        double num= Input.real("Introduce el número real que quieres introduccir en tu lista: ");
        lista.add(num);
        return lista;
    }

    public static double metodoB (ArrayList<Double> lista){
        double suma=0;
        for(int i=0; i<lista.size();i++){
            suma+=lista.get(i);
        }
        System.out.printf("La suma de los elementos de la lista es: %.8f ", suma);
        return suma;
    }

    public static ArrayList<Double> metodoC(ArrayList<Double> lista){
        lista.remove(lista.size()-1);
        return lista;
    }
}
