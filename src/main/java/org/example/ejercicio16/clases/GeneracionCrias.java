package org.example.ejercicio16.clases;

import org.example.ejercicio13.clases.*;
import org.example.ejercicio14.clases.GetListaAnimalesCreada;

import java.util.ArrayList;
import java.util.Random;

public class GeneracionCrias {
    public static ArrayList<Animal> animalesNuevos;
    public static ArrayList<Animal> listaAnimales;

    public static ArrayList<Animal> devulveListaCrias(ArrayList<Animal> animalesIniciales) {
        ArrayList<Animal> listaAnimales = new ArrayList<>();

        listaAnimales = animalesIniciales;

        int generacion = 1;
        int numPoblacion = 0;
        while (numPoblacion != listaAnimales.size()) {
            ArrayList<Animal> animalesNuevos = new ArrayList<>();
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
                            generacion = Math.max(i.getGeneracion(), j.getGeneracion()) + 1;
                            Random random = new Random();
                            if (i.isMasculino()) {
                                animalesNuevos.add(new Oveja(i.getRaza(), i, j, generacion, random.nextBoolean(), ((Oveja) j).getPropietario()));
                            } else {
                                animalesNuevos.add(new Oveja(i.getRaza(), j, i, generacion, random.nextBoolean(), ((Oveja) j).getPropietario()));
                            }

                        }
                        if (i instanceof Perro) {
                            generacion = Math.max(i.getGeneracion(), j.getGeneracion()) + 1;
                            Random random = new Random();
                            if (i.isMasculino()) {
                                animalesNuevos.add(new Perro(i.getRaza(), i, j, generacion, random.nextBoolean(), ((Perro) i).getNombre(), ((Perro) j).getPropietario()));
                            } else {
                                animalesNuevos.add(new Perro(i.getRaza(), j, i, generacion, random.nextBoolean(), ((Perro) i).getNombre(), ((Perro) i).getPropietario()));
                            }
                        }


                        if (i instanceof PezPayaso) {
                            generacion = Math.max(i.getGeneracion(), j.getGeneracion()) + 1;
                            Random random = new Random();
                            if (i.isMasculino()) {
                                animalesNuevos.add(new PezPayaso(i.getRaza(), i, j, generacion, random.nextBoolean()));
                            } else {
                                animalesNuevos.add(new PezPayaso(i.getRaza(), j, i, generacion, random.nextBoolean()));
                            }

                        }
                        if (i instanceof Tucan) {
                            generacion = Math.max(i.getGeneracion(), j.getGeneracion()) + 1;
                            Random random = new Random();
                            if (i.isMasculino()) {
                                animalesNuevos.add(new Tucan(i.getRaza(), i, j, generacion, random.nextBoolean()));
                            } else {
                                animalesNuevos.add(new Tucan(i.getRaza(), j, i, generacion, random.nextBoolean()));
                            }
                        }
                        if (i instanceof Vaca) {
                            generacion = Math.max(i.getGeneracion(), j.getGeneracion()) + 1;
                            Random random = new Random();
                            if (i.isMasculino()) {
                                animalesNuevos.add(new Vaca(i.getRaza(), i, j, generacion, random.nextBoolean(), ((Vaca) j).getPropietario()));
                            } else {
                                animalesNuevos.add(new Vaca(i.getRaza(), j, i, generacion, random.nextBoolean(), ((Vaca) j).getPropietario()));
                            }

                        }

                    }
                }

            }
            numPoblacion = listaAnimales.size();
            listaAnimales = animalesNuevos;

        }
        return listaAnimales;
    }

    public static ArrayList<Animal> devulveListaCriasCapadoGen4(ArrayList<Animal> animalesIniciales) {
        ArrayList<Animal> listaAnimales = new ArrayList<>();

        int generacion = 1;
        int numPoblacion = 0;
        int maxGeneracion = 1;

        //el while nos permite controlar cuando deja de crear nuevos bichos (paramos en la generacion 4)
        while (maxGeneracion <= 4) {
            //instaciamos la lista nueva que vamos a modificar dentro del bucle y la igualamos a la
            //listaAnimales de la iteración anterior
            ArrayList<Animal> animalesNuevos = new ArrayList<>();
            animalesNuevos.addAll(listaAnimales);

            //recorremos todas las opciones, se podría optimizar usando solo la parte superior de la matriz
            //pero como es simetrica solo nos libramos de las i=j (que son n iteraciones)
            for (Animal i : listaAnimales) {
                for (Animal j : listaAnimales) {
                    //Pasamos todos los criterios que tiene que pasar para crearse una nueva cría

                    if (i.getClass() == j.getClass()
                            //comprueba los sexos
                            && i.isMasculino() != j.isMasculino()
                            //comprueba si son hermanos
                            && !parentescoHermanos(i, j)
                            //comprueba si uno es padre o madre de otro
                            && !parentescoMadre(i, j)
                            && !parentescoPadre(i, j)
                            //&&i.getNumeroCrias()<3
                            //&&j.getNumeroCrias()<3
                            && numeroCriasPareja(i, j, animalesNuevos) < 3) {
                        //&&!comprobarMadre(i,j)
                        //&&!comprobarMadre(j,i)
                        //&&!comprobarPadre(i,j)
                        //&&!comprobarPadre(j,i)

                        //comprueba si tienen abuelos en comun
                        //&&!comprobarAbuelos(generarAbuelos(i),generarAbuelos(j))
                        //&&!comprobarAbuelas(generarAbuelas(i),generarAbuelas(j))
                        // ) {
                        //instanciamos el objeto
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
                            generacion = Math.max(i.getGeneracion(), j.getGeneracion()) + 1;
                            Random random = new Random();
                            if (i.isMasculino()) {
                                animalesNuevos.add(new Oveja(i.getRaza(), i, j, generacion, random.nextBoolean(), ((Oveja) j).getPropietario()));
                            } else {
                                animalesNuevos.add(new Oveja(i.getRaza(), j, i, generacion, random.nextBoolean(), ((Oveja) j).getPropietario()));
                            }

                        }
                        if (i instanceof Perro) {
                            generacion = Math.max(i.getGeneracion(), j.getGeneracion()) + 1;
                            Random random = new Random();
                            if (i.isMasculino()) {
                                animalesNuevos.add(new Perro(i.getRaza(), i, j, generacion, random.nextBoolean(), ((Perro) i).getNombre(), ((Perro) j).getPropietario()));
                            } else {
                                animalesNuevos.add(new Perro(i.getRaza(), j, i, generacion, random.nextBoolean(), ((Perro) i).getNombre(), ((Perro) i).getPropietario()));
                            }
                        }


                        if (i instanceof PezPayaso) {
                            generacion = Math.max(i.getGeneracion(), j.getGeneracion()) + 1;
                            Random random = new Random();
                            if (i.isMasculino()) {
                                animalesNuevos.add(new PezPayaso(i.getRaza(), i, j, generacion, random.nextBoolean()));
                            } else {
                                animalesNuevos.add(new PezPayaso(i.getRaza(), j, i, generacion, random.nextBoolean()));
                            }

                        }
                        if (i instanceof Tucan) {
                            generacion = Math.max(i.getGeneracion(), j.getGeneracion()) + 1;
                            Random random = new Random();
                            if (i.isMasculino()) {
                                animalesNuevos.add(new Tucan(i.getRaza(), i, j, generacion, random.nextBoolean()));
                            } else {
                                animalesNuevos.add(new Tucan(i.getRaza(), j, i, generacion, random.nextBoolean()));
                            }
                        }
                        if (i instanceof Vaca) {

                            generacion = Math.max(i.getGeneracion(), j.getGeneracion()) + 1;
                            Random random = new Random();
                            if (i.isMasculino()) {
                                animalesNuevos.add(new Vaca(i.getRaza(), i, j, generacion, random.nextBoolean(), ((Vaca) j).getPropietario()));
                            } else {
                                animalesNuevos.add(new Vaca(i.getRaza(), j, i, generacion, random.nextBoolean(), ((Vaca) j).getPropietario()));
                            }

                        }

                    }
                }

            }
            numPoblacion = listaAnimales.size();
            listaAnimales = animalesNuevos;
            int index = 0;
            for (int i = 0; i < listaAnimales.size(); i++) {
                if (listaAnimales.get(i).getGeneracion() > maxGeneracion) {
                    maxGeneracion = listaAnimales.get(i).getGeneracion();
                    index = i;
                }
            }

        }

        return listaAnimales;
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
        if (animal1.getGeneracion() == 1 || animal2.getGeneracion() == 1) {
            return false;
        } else {
            //Si tienen el mismo padre o la misma madre son hermanos
            if (animal1.getPadre().equals(animal2.getPadre()) && animal1.getMadre().equals(animal2.getMadre())) {
                return true;
            } else {
                return false;
            }
        }

    }

    public static int numeroCriasPareja(Animal animal1, Animal animal2, ArrayList<Animal> listaAnimales) {

        int conteoCriasPareja = 0;

        for (Animal i : listaAnimales) {
            if (i.getGeneracion() == 1 || i.getGeneracion() == 1) {

            } else if ((i.getPadre().equals(animal1) && i.getMadre().equals(animal2)) || (i.getMadre().equals(animal1) && i.getPadre().equals(animal2))) {
                conteoCriasPareja++;
            }
        }
        return conteoCriasPareja;
    }

}


