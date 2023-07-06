package org.example.ejercicio17.Test;

import org.example.ejercicio13.clases.*;

import java.util.ArrayList;
import java.util.Random;

public class TestAbuelas {

    public static void main(String[] Args) {
        ArrayList<Animal> listaAnimales = new ArrayList<>();

        Gato g_mas = new Gato("persa", true, "Firulais", "Noe");
        listaAnimales.add(g_mas);
        Gato g_fem = new Gato("persa", false, "María", "Noe");
        listaAnimales.add(g_fem);
        //  Gato g2_mas = new Gato("persa", true, "Gregorio", "Juan");
        // listaAnimales.add(g2_mas);
        Gato g2_fem = new Gato("egipcio", false, "Gregorio", "Pedro");
        listaAnimales.add(g2_fem);

        int generacion = 1;
        int numPoblacion = 0;
        for (int k = 1; k < 4; k++) {
            ArrayList<Animal> animalesNuevos = new ArrayList<>();
            animalesNuevos.addAll(listaAnimales);
            for (Animal i : listaAnimales) {
                for (Animal j : listaAnimales) {
                    if (i.getClass() == j.getClass()) {
                        //&& i.isMasculino() != j.isMasculino()
                        //&& !parentescoHermanos(i, j)
                        //&& !parentescoMadre(i, j)
                        //&& !parentescoPadre(i, j)
                        //&&i.getNumeroCrias()<3
                        //&&j.getNumeroCrias()<3
                        //&& numeroCriasPareja(i, j, animalesNuevos) < 3
                        //&&!comprobarMadre(i,j)
                        //&&!comprobarMadre(j,i)
                        //&&!comprobarPadre(i,j)
                        //&&!comprobarPadre(j,i)) {
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
                        if (i instanceof Perro) {

                        }
                        if (i instanceof PezPayaso) {

                        }
                        if (i instanceof Tucan) {

                        }
                        if (i instanceof Vaca) {

                        }

                    }
                }

            }
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
            System.out.println(generarAbuelos(listaAnimales.get(1)).toString());
            System.out.println(generarAbuelas(listaAnimales.get(1)).toString());
            System.out.println(listaAnimales.get(listaAnimales.size()-1));

    }


        public static ArrayList<Animal> generarAbuelos (Animal a){
            ArrayList<Animal> abuelos = new ArrayList<Animal>();

            if (a.getPadre().getGeneracion() == 1) {
                abuelos.add(a.getPadre());
                return abuelos;
            } else {
                abuelos.addAll(generarAbuelos(a.getPadre()));
                abuelos.addAll(generarAbuelos(a.getMadre()));
                return abuelos;
            }


        }

        public static ArrayList<Animal> generarAbuelas (Animal a){
            ArrayList<Animal> abuelas = new ArrayList<Animal>();

            if (a.getPadre().getGeneracion() == 1) {
                abuelas.add(a.getMadre());
                return abuelas;
            } else {
                abuelas.addAll(generarAbuelas(a.getPadre()));
                abuelas.addAll(generarAbuelas(a.getMadre()));
                return abuelas;
            }


        }
    }
