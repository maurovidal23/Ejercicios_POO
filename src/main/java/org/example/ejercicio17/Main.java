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
        //Gato g2_fem= new Gato("egipcio",false,"Gregorio","Pedro");
        //listaAnimales.add(g2_fem);
       // Gato g3_fem=new Gato("egipcio",false,"Fernanda","Yo");
       // listaAnimales.add(g3_fem);

        int generacion = 1;
        int numPoblacion = 0;
        int maxGeneracion=1;

        //el while nos permite controlar cuando deja de crear nuevos bichos (paramos en la generacion 4)
        while (maxGeneracion<=4) {
            //instaciamos la lista nueva que vamos a modificar dentro del bucle y la igualamos a la
            //listaAnimales de la iteración anterior
            ArrayList<Animal> animalesNuevos= new ArrayList<>();
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
            int index=0;
            for(int i=0; i<listaAnimales.size();i++){
                if(listaAnimales.get(i).getGeneracion()>maxGeneracion){
                    maxGeneracion=listaAnimales.get(i).getGeneracion();
                    index=i;
                }
            }

        }
        //Salida consola
        int indexGen0=0;
        int indexGen1=0;
        int indexGen2=0;
        int indexGen3=0;
        int indexGen4=0;
        int numCriasmax=0;
        for(Animal i:listaAnimales){
            if(i.getGeneracion()==1){
                indexGen0++;
            } else if(i.getGeneracion()==2){
                indexGen1++;
            }else if(i.getGeneracion()==3){
                indexGen2++;
            }else if(i.getGeneracion()==4){
                indexGen3++;
            }else if(i.getGeneracion()==5){
                indexGen4++;
            }

            if(i.getNumeroCrias()>numCriasmax){
                numCriasmax=i.getNumeroCrias();
            }
        }
        System.out.println("Num animales iniciales: " + indexGen0);
        System.out.println("Num animales 1ª generacion: " + indexGen1);
        System.out.println("Num animales 2ª generacion: " +indexGen2);
        System.out.println("Num animales 3º generacion: "+indexGen3);
        System.out.println("Num animales 4º generacion: "+indexGen4 );
        System.out.println(numCriasmax);
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
        for(Animal i : listaAnimales){
            if(i.getGeneracion()==1){

            }else if((i.getPadre().equals(animal1) && i.getMadre().equals(animal2))||(i.getMadre().equals(animal1)&&i.getPadre().equals(animal2))){
                conteoCriasPareja++;
            }
        }
        return conteoCriasPareja;
    }
/*
    //pasamos animal 1 y animal 2 para comprobar si el animal1 esta en la línea genética del animal 2
    public static boolean comprobarPadre(Animal an1,Animal an2){
        //¿tiene padre?
        if(an2.getGeneracion()==1){
            return false;
            //si tiene padre comprobamos si es igual
        }else if(an2.getPadre().equals(an1)){
            return true;
            //¿Tiene abuelos (si tiene 1 tiene los 2?
        }else if((an2.getPadre()).getPadre()!=null){
            //Si tiene abuelos comprobamos si an1 es padre, del padre de an2 o si an1 es padre de la madre de an2...
            return comprobarPadre(an1,an2.getPadre())||comprobarPadre(an1,an2.getMadre());
            //¿Tiene abuelo materno
        }else{
            return false;
        }
    }

    public static boolean comprobarMadre(Animal an1,Animal an2){
        if(an2.getGeneracion()==1){
            return false;
        }else if(an2.getMadre().equals(an1)){
            return true;
        }else if((an2.getMadre()).getMadre()!=null){
            return comprobarMadre(an1,an2.getPadre())||comprobarMadre(an1,an2.getMadre());
        }else {
            return false;
        }
    }



    public static ArrayList<Animal> generarAbuelos(Animal a){
        ArrayList<Animal> abuelos= new ArrayList<Animal>();
        if(a.getGeneracion()==1){
            return null;
        }
        if(a.getPadre().getGeneracion()==1){
            abuelos.add(a.getPadre());
            return abuelos;
        }else if(a.getMadre().getGeneracion()==1) {
            abuelos.addAll(generarAbuelos(a.getPadre()));
            return abuelos;
        }else{
            abuelos.addAll(generarAbuelos(a.getPadre()));
            abuelos.addAll(generarAbuelos(a.getMadre()));
            return abuelos;
        }


    }

    public static ArrayList<Animal> generarAbuelas(Animal a){
        ArrayList<Animal> abuelas= new ArrayList<Animal>();
        if(a.getGeneracion()==1){
            return null;
        }
        if(a.getMadre().getGeneracion()==1){
            abuelas.add(a.getMadre());
            return abuelas;
        }else if(a.getPadre().getGeneracion()==1) {
            abuelas.addAll(generarAbuelas(a.getMadre()));
            return abuelas;
        }else{
            abuelas.addAll(generarAbuelas(a.getPadre()));
            abuelas.addAll(generarAbuelas(a.getMadre()));
            return abuelas;
        }


    }

    public static boolean comprobarAbuelos(ArrayList<Animal> abuelos1,ArrayList<Animal> abuelos2){
        //¿Tienen abuelos en comun?
        if(abuelos2==null||abuelos1==null){
            return false;
        }
        for(Animal i: abuelos1){
            for(Animal j:abuelos2){
                if(i.equals(j)){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean comprobarAbuelas(ArrayList<Animal> abuelas1,ArrayList<Animal> abuelas2){
        //¿Tienen abuelos en comun?
        if(abuelas2==null||abuelas1==null){
            return false;
        }
        for(Animal i: abuelas1){
            for(Animal j:abuelas2){
                if(i.equals(j)){
                    return true;
                }
            }
        }
        return false;
    }

 */


}