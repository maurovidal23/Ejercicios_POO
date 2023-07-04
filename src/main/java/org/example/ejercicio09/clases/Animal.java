package org.example.ejercicio09.clases;

import java.util.HashMap;
import java.util.Map;

public class Animal {

    public REINO reino;
    //public static final String MAMIFERO= "Mamifero";
    public enum REINO{
        MAMIFERO,
        AVES,
        ANFIBIOS,
        REPTILES,
        PECES
    }
    private static Map<REINO,String> nombresReinos;

   public TIPO tipo;
    public enum TIPO{
        GATO,
        PERIQUITO,
        PERRO,
        CANARIO
    }
    private static Map<TIPO,String> nombresTipos;
    public String raza;
    public MEDIO medio;
    public enum MEDIO{
        ACUÁTICO,
        AEREO,
        TERRESTRE
    }
    private static Map<MEDIO,String> nombresMedios;

    public Animal(REINO reino, TIPO tipo, String raza, MEDIO medio) {
        this.reino = reino;
        this.tipo = tipo;
        this.raza = raza;
        this.medio = medio;
        Animal.rellenarMapas();
    }

    public Animal(REINO reino, TIPO tipo, String raza) {
        this.reino = reino;
        this.tipo = tipo;
        this.raza = raza;
        Animal.rellenarMapas();
    }

    private static void rellenarMapas(){
        if(Animal.nombresReinos==null){
            Animal.nombresReinos= new HashMap<>();
            Animal.nombresReinos.put(REINO.MAMIFERO, "Mamifero");
            Animal.nombresReinos.put(REINO.AVES, "Aves");
            Animal.nombresReinos.put(REINO.ANFIBIOS, "Anfibios");
            Animal.nombresReinos.put(REINO.PECES, "Peces");
            Animal.nombresReinos.put(REINO.REPTILES, "Reptiles");

        }

        if(Animal.nombresTipos==null){
            Animal.nombresTipos=new HashMap<>();
            Animal.nombresTipos.put(TIPO.CANARIO,"Canario");
            Animal.nombresTipos.put(TIPO.GATO,"Gato");
            Animal.nombresTipos.put(TIPO.PERIQUITO,"Periquito");
            Animal.nombresTipos.put(TIPO.PERRO, "Perro");
        }
        if(Animal.nombresMedios==null){
            Animal.nombresMedios=new HashMap<>();
            Animal.nombresMedios.put(MEDIO.ACUÁTICO,"Acuatico");
            Animal.nombresMedios.put(MEDIO.TERRESTRE,"Terrestre");
            Animal.nombresMedios.put(MEDIO.AEREO,"Aereo");
        }
    }

    @Override
    public String toString() {
        return "Animal{" +
                "reino=" + nombresReinos.get(this.reino) +
                ", tipo=" + nombresTipos.get(this.tipo) +
                ", raza='" + raza + '\'' +
                ", medio=" + nombresMedios.get(this.medio) +
                '}';
    }
}
