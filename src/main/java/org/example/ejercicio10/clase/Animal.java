package org.example.ejercicio10.clase;

import java.util.HashMap;
import java.util.Map;

public class Animal {

    private REINO reino;
    //public static final String MAMIFERO= "Mamifero";
    public enum REINO{
        MAMIFERO,
        AVES,
        ANFIBIOS,
        REPTILES,
        PECES
    }
    private static Map<REINO,String> nombresReinos;

    private TIPO tipo;
    public enum TIPO{
        GATO,
        PERIQUITO,
        PERRO,
        CANARIO,
        TUCAN,
        PEZ_PAYASO,
        VACA,
        OVEJA
    }
    private static Map<TIPO,String> nombresTipos;
    private String raza;
    public MEDIO medio;
    public enum MEDIO{
        ACUÁTICO,
        AEREO,
        TERRESTRE
    }
    private static Map<MEDIO,String> nombresMedios;

    //Constructor de copia

    public Animal(Animal animalCopia){
        this.reino=animalCopia.reino;
        this.tipo=animalCopia.tipo;
        this.raza=animalCopia.raza;
        this.medio=animalCopia.medio;
    }
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

    public Animal() {
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
            Animal.nombresTipos.put(TIPO.OVEJA, "Oveja");
            Animal.nombresTipos.put(TIPO.PEZ_PAYASO, "Pez payaso");
            Animal.nombresTipos.put(TIPO.TUCAN, "Tucan");
            Animal.nombresTipos.put(TIPO.VACA, "Vaca");
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

    @Override
    public Animal clone(){
        Animal copiaAnimal = new Animal(this.reino, this.tipo, this.raza, this.medio);
        return copiaAnimal;
    }

    public REINO getReino() {
        return reino;
    }

    public void setReino(REINO reino) {
        this.reino = reino;
    }

    public TIPO getTipo() {
        return tipo;
    }

    public void setTipo(TIPO tipo) {
        this.tipo = tipo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public MEDIO getMedio() {
        return medio;
    }

    public void setMedio(MEDIO medio) {
        this.medio = medio;
    }
}
