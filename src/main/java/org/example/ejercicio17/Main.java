package org.example.ejercicio17;
import org.example.ejercicio13.clases.*;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] Args) {
        ArrayList<Animal> listaAnimales = new ArrayList<>();

        Gato g_mas = new Gato("persa", true, "Firulais", "Noe");
        listaAnimales.add(g_mas);
        Gato g_fem = new Gato("persa", false, "María", "Noe");
        listaAnimales.add(g_fem);
        Gato g2_mas = new Gato("persa", true, "Gregorio", "Juan");
        listaAnimales.add(g2_mas);
        Gato g2_fem= new Gato("egipcio",false,"Gregorio","Pedro");
        listaAnimales.add(g2_fem);

        int generacion = 1;
        int numPoblacion = 0;
        while (numPoblacion != listaAnimales.size()) {
            ArrayList<Animal> animalesNuevos= new ArrayList<>();
            animalesNuevos.addAll(listaAnimales);
            for (Animal i : listaAnimales) {
                for (Animal j : listaAnimales) {
                    if (i.getClass() == j.getClass()
                            && i.isMasculino() != j.isMasculino()
                            && !parentescoHermanos(i, j)
                            && !parentescoMadre(i, j)
                            && !parentescoPadre(i, j)
                            && numeroCriasPareja(i, j, animalesNuevos) < 3) {
                        if (i instanceof Gato) {
                            generacion = Math.max(i.getGeneracion(), j.getGeneracion()) + 1;
                            Random random = new Random();
                            if (i.isMasculino()) {
                                animalesNuevos.add(new Gato(i.getRaza(), i, j, generacion, random.nextBoolean(), ((Gato) i).getNombre(), ((Gato) j).getPropietario()));
                            } else {
                                animalesNuevos.add(new Gato(i.getRaza(), j, i, generacion, random.nextBoolean(), ((Gato) i).getNombre(), ((Gato) i).getPropietario()));
                            }
                        }

                        if (i instanceof Oveja) {


                        }
                        if(i instanceof Perro){

                        }
                        if(i instanceof PezPayaso){

                        }
                        if(i instanceof Tucan){

                        }
                        if(i instanceof Vaca){

                        }

                    }
                }

            }
            numPoblacion = listaAnimales.size();
            listaAnimales=animalesNuevos;


        }
        int maxGeneracion=1;
        int index=0;
        for(int i=0; i<listaAnimales.size();i++){
            if(listaAnimales.get(i).getGeneracion()>maxGeneracion){
                maxGeneracion=listaAnimales.get(i).getGeneracion();
                index=i;
            }
        }
        System.out.println(listaAnimales.size());
        System.out.println(maxGeneracion);
        System.out.println(listaAnimales.get(index));
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
            if(animal1.getPadre().equals(animal2.getPadre())||animal1.getMadre().equals(animal2.getMadre())){
                return true;
            }else{
                return false;
            }
        }

    }

    public static int numeroCriasPareja(Animal animal1,Animal animal2,ArrayList<Animal> listaAnimales){
        int conteoCriasPareja=0;
        for(Animal i: listaAnimales){
            if(i.getGeneracion()==1||i.getGeneracion()==1){

            }else if((i.getPadre().equals(animal1) && i.getMadre().equals(animal2))||(i.getMadre().equals(animal1)&&i.getPadre().equals(animal2))){
                conteoCriasPareja++;
            }
        }
        return conteoCriasPareja;
    }




}