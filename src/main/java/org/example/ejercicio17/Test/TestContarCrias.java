package org.example.ejercicio17.Test;

import org.example.ejercicio13.clases.Animal;
import org.example.ejercicio13.clases.Gato;

import java.util.ArrayList;

public class TestContarCrias {
    public static void main(String[]Args){
        ArrayList<Animal> listaAnimales = new ArrayList<>();
        Gato g_mas = new Gato("persa", true, "Firulais", "Noe");
        listaAnimales.add(g_mas);
        Gato g_fem = new Gato("persa", false, "María", "Noe");
        listaAnimales.add(g_fem);
        /* public Gato(String raza, Animal padre, Animal madre, int generacion, boolean sexo, String nombre, String propietario) {
        super(REINO.MAMIFERO, TIPO.GATO, raza,  MEDIO.TERRESTRE, padre, madre, generacion, sexo, nombre, propietario);
    }

         */
        Gato g1= new Gato("persa",g_mas,g_fem,2,true,"Juan Alfonso","");
        listaAnimales.add(g1);
        Gato g2= new Gato("persa",g_mas,g_fem,2,true,"Juan Alberto","");
        listaAnimales.add(g2);
        Gato g3=new Gato("egipcio",g_mas,g_fem,2,true,"Juan Pardo","");
        listaAnimales.add(g3);
        Gato g4= new Gato("asiatico",g_mas,g_fem,2,false,"María","Yo");
        listaAnimales.add(g4);
        Gato g5= new Gato("persa",g_mas,g4,3,false,"Mary","");
        listaAnimales.add(g5);
        Gato g6= new Gato("europeo",g_mas, g4,3,true,"Alfonso","");
        listaAnimales.add(g6);
        Gato g7= new Gato("caucasico",g_mas,g4,3,true,"Rodrigo","");
        listaAnimales.add(g7);
        Gato g8=  new Gato("persa",g_mas,g5,4,true,"Gavilan","");
        listaAnimales.add(g8);

        System.out.println(numeroCriasPareja(g_mas,g_fem,listaAnimales));
        System.out.println(numeroCriasPareja(g_mas,g4,listaAnimales));

    }

    public static int numeroCriasPareja(Animal animal1,Animal animal2,ArrayList<Animal> listaAnimales){
        int conteoCriasPareja=0;
        for(Animal i : listaAnimales){
            if(i.getGeneracion()==1){

            }else if((i.getPadre().equals(animal1) && i.getMadre().equals(animal2))||(i.getMadre().equals(animal1)&&i.getPadre().equals(animal2))){
                conteoCriasPareja++;
            }
        }
        return conteoCriasPareja;
    }
}
