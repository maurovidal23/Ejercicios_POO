package org.example.ejercicio19;

import org.example.ejercicio13.clases.*;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
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


        generarCSV(listaAnimales);
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
            if (animal1.getPadre().equals(animal2.getPadre()) || animal1.getMadre().equals(animal2.getMadre())) {
                return true;
            } else {
                return false;
            }
        }

    }

    public static int numeroCriasPareja(Animal animal1, Animal animal2, ArrayList<Animal> listaAnimales) {
        int conteoCriasPareja = 0;
        for (Animal i : listaAnimales) {
            if (i.getGeneracion() == 1) {

            } else if ((i.getPadre().equals(animal1) && i.getMadre().equals(animal2)) || (i.getMadre().equals(animal1) && i.getPadre().equals(animal2))) {
                conteoCriasPareja++;
            }
        }
        return conteoCriasPareja;
    }

    public static void generarCSV(ArrayList<Animal> listaAnimales) {
        File file = new File("salida.csv");
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new FileWriter(file));
            pw.println("Id,Nombre,Tipo,Padre,Madre,Propietario,Generacion,Genero");
            for (Animal i : listaAnimales) {

                //condiciones ternarias variable si ()?->verdadero entonces primeraSentencia: y ()?->falso entonces segunda sentencia
                String padre = i.getPadre() == null ? "" : String.valueOf(i.getPadre().getId());
                String madre = i.getMadre() == null ? "" : String.valueOf(i.getMadre().getId());
                String linea = null;
                if (i instanceof Mascota) {
                    linea = i.getId() + "," + ((Gato) i).getNombre() + "," + i.getTipo() + "," + padre
                            + "," + madre + "," + ((Gato) i).getPropietario() + "," + i.getGeneracion() + "," + i.isMasculino();
                } else if (i instanceof AnimalGranja) {
                    linea = i.getId() + "," + " " + "," + i.getTipo() + "," + padre
                            + "," + madre + "," + ((Oveja) i).getPropietario() + "," + i.getGeneracion() + "," + i.isMasculino();
                } else if (i instanceof AnimalSalvaje) {
                    linea = i.getId() + "," + "" + "," + i.getTipo() + "," + padre
                            + "," + madre + "," + "" + "," + i.getGeneracion() + "," + i.isMasculino();
                }
                pw.println(linea);

            }
        } catch (Exception e) {
            e.printStackTrace();

        }finally {
            try{
                if(file!=null){
                    pw.close();
                }
            }catch (Exception e2){
                e2.printStackTrace();
            }


        }

    }
}