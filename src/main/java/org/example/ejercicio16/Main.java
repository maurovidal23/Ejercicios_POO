package org.example.ejercicio16;

import org.example.ejercicio13.clases.Animal;
import org.example.ejercicio13.clases.Gato;

import java.util.ArrayList;

public class Main {
    public static void main(String[] Args) {
        ArrayList<Animal> listaAnimales = new ArrayList<>();
        Gato g_mas = new Gato("persa", true,"Firulais", "Noe");
        listaAnimales.add(g_mas);
        Gato g_fem = new Gato("persa",false, "María", "Noe");
        listaAnimales.add(g_fem);
        Animal.TIPO tipo;
        int generacion = 1;
        int numPoblacion = 0;
        ArrayList<Class> listaTipos=new ArrayList<>();
        listaTipos.add(g_mas.getClass());
        while (numPoblacion != listaAnimales.size()){
            numPoblacion = listaAnimales.size();
            for (Animal i : listaAnimales) {
                for (Animal j : listaAnimales) {
                    if(i.getClass()!=j.getClass()&&!parentescoHermanos(i,j)&&!parentescoMadre(i,j)&&!parentescoPadre(i,j)&&i.getNumeroCrias()<3&&j.getNumeroCrias()<3){
                       if(i instanceof Gato){
                           Gato gato1=(Gato) i;
                           Gato gato2=(Gato) j;
                           if(gato1.isMasculino()!=gato2.isMasculino()){
                               generacion++;
                               if(gato1.isMasculino()){

                               }
                           }
                       }

                    }

                }
            }
            numPoblacion = listaAnimales.size();
        }


    }

    public static boolean parentescoPadre(Animal animal1, Animal animal2) {
        //si los dos son de primera generación entonces no puede ser uno padre del otro
        if (animal1.getGeneracion() == 1 && animal2.getGeneracion() == 1) {
            return false;
            //Si el animal1 es de primera generación solo el puede ser padre de otro
        } else if (animal1.getGeneracion() == 1) {
            if (animal2.getPadre().equals(animal1)) {
                return true;
            } else {
                return false;
            }
            //Si el animal2 es de primera generación solo el puede ser padre de otro
        } else if (animal2.getGeneracion() == 1) {
            if (animal1.getPadre().equals(animal2)) {
                return true;
            } else {
                return false;
            }
        } else {
            if (animal1.getPadre().equals(animal2) || animal2.getPadre().equals(animal1)) {
                return true;
            } else {
                return false;
            }

        }

    }
    public static boolean parentescoMadre(Animal animal1, Animal animal2) {
        if (animal1.getGeneracion() == 1 && animal2.getGeneracion() == 1) {
            return false;
        } else if (animal1.getGeneracion() == 1) {
            if (animal2.getMadre().equals(animal1)) {
                return true;
            } else {
                return false;
            }
        } else if (animal2.getGeneracion() == 1) {
            if (animal1.getMadre().equals(animal2)) {
                return true;
            } else {
                return false;
            }
        } else {
            if (animal1.getMadre().equals(animal2) || animal2.getMadre().equals(animal1)) {
                return true;
            } else {
                return false;
            }

        }

    }

    public static boolean parentescoHermanos(Animal animal1, Animal animal2) {
        //Si uno es de primera generación no tiene padres por lo tanto no tiene hermanos
       if(animal1.getGeneracion()==1||animal2.getGeneracion()==1){
           return false;
       }else{
           //Si tienen el mismo padre o la misma madre son hermanos
           if(animal1.getPadre().equals(animal2.getPadre())&&animal1.getMadre().equals(animal2.getMadre())){
               return true;
           }else{
               return false;
           }
       }

    }




}