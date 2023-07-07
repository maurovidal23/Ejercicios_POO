package org.example.ejercicio13.clases;

import org.example.ejercicio14.clases.ISexual;

import java.util.HashMap;
import java.util.Map;

public abstract class Animal  implements ISexual {
    public enum SEXO{
        MASCULINO,
        FEMENINO
    }
    private REINO reino;
    //public static final String MAMIFERO= "Mamifero";
    public enum REINO{
        MAMIFERO,
        AVES,
        ANFIBIOS,
        REPTILES,
        PECES
    }
    public static Map<REINO,String> nombresReinos;

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
    public static Map<TIPO,String> nombresTipos;
    private String raza;
    private MEDIO medio;
    public enum MEDIO{
        ACUÁTICO,
        AEREO,
        TERRESTRE
    }
    public static Map<MEDIO,String> nombresMedios;

    private boolean masculino;
    private int numeroCrias;
    private Animal padre;
    private int idPadre;
    private int idMadre;
    private Animal madre;
    private int generacion=1;

    private int id;
    private static int idAnimales=0;

    private static Map<Integer,Animal> idAnimalRef;
    //Constructor de copia

    public Animal(Animal animalCopia){
        this.reino=animalCopia.reino;
        this.tipo=animalCopia.tipo;
        this.raza=animalCopia.raza;
        this.medio=animalCopia.medio;
        this.id=generarId();
        rellenarAnimalRef(this);
    }
    public Animal(REINO reino, TIPO tipo, String raza, MEDIO medio,boolean sexo) {
        this.reino = reino;
        this.tipo = tipo;
        this.raza = raza;
        this.medio = medio;
        this.masculino=sexo;
        Animal.rellenarMapas();
        this.id=generarId();
        rellenarAnimalRef(this);

    }


    public Animal(REINO reino, TIPO tipo, String raza,boolean sexo) {
        this.reino = reino;
        this.tipo = tipo;
        this.raza = raza;
        this.masculino=sexo;
        Animal.rellenarMapas();
        this.id=generarId();
        rellenarAnimalRef(this);
    }

    public Animal() {
    }

    public Animal(REINO reino, TIPO tipo, MEDIO medio, boolean masculino, Animal padre, Animal madre, int generacion, int id) {
        this.reino = reino;
        this.tipo = tipo;
        this.medio = medio;
        this.masculino = masculino;
        this.padre = padre;
        this.madre = madre;
        this.generacion = generacion;
        this.id = id;
        rellenarAnimalRef(this);
    }

    public Animal(REINO reino, TIPO tipo, MEDIO medio, boolean masculino, int idPadre,int idMadre, int generacion, int id) {
        this.reino = reino;
        this.tipo = tipo;
        this.medio = medio;
        this.masculino = masculino;
        this.idPadre = idPadre;
        this.idMadre = idMadre;
        this.generacion = generacion;
        this.id = id;
        this.padre=fijarPadre();
        this.madre=fijarMadre();
        rellenarAnimalRef(this);
    }

    public Animal(REINO reino, TIPO tipo, String raza, MEDIO medio, Animal padre, Animal madre, int generacion, boolean sexo) {
        this.reino = reino;
        this.tipo = tipo;
        this.raza = raza;
        this.medio = medio;
        this.padre = padre;
        this.madre = madre;
        this.generacion=generacion;
        this.masculino=sexo;
        padre.sumarCrias();
        madre.sumarCrias();
        this.id=generarId();
        rellenarAnimalRef(this);
    }

    public Animal fijarPadre(){
        if(this.idPadre!=0){
            Animal a= idAnimalRef.get(this.idPadre);
            return a;
        }else{
            return null;
        }

    }
    public Animal fijarMadre(){
        if(this.idMadre!=0){
            Animal a=idAnimalRef.get(this.idPadre);
            return a;
        }else{
            return null;
        }

    }
    public int generarId(){
        idAnimales++;
        return idAnimales;
    }
    public void sumarCrias(){
        this.numeroCrias++;

    }

    private static void rellenarAnimalRef(Animal a){
        if(Animal.idAnimalRef==null){
            Animal.idAnimalRef= new HashMap<>();
        }
        idAnimalRef.put(a.getId(),a);
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
    public abstract Animal clone();
    public abstract void reproducirSonido();
    public abstract void desplazamiento();


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

    public int getNumeroCrias() {
        return numeroCrias;
    }

    public void setNumeroCrias(int numeroCrias) {
        this.numeroCrias = numeroCrias;
    }

    public Animal getPadre() {
        return padre;
    }

    public void setPadre(Animal padre) {
        this.padre = padre;
    }

    public Animal getMadre() {
        return madre;
    }

    public void setMadre(Animal madre) {
        this.madre = madre;
    }

    public int getGeneracion() {
        return generacion;
    }

    public void setGeneracion(int generacion) {
        this.generacion = generacion;
    }

    @Override
    public boolean isMasculino() {
        return masculino;
    }

    @Override
    public void setMasculino(boolean masculino) {
        this.masculino = masculino;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static Map<Integer, Animal> getIdAnimalRef() {
        return idAnimalRef;
    }

    public static void setIdAnimalRef(Map<Integer, Animal> idAnimalRef) {
        Animal.idAnimalRef = idAnimalRef;
    }

    public int getIdPadre() {
        return idPadre;
    }

    public void setIdPadre(int idPadre) {
        this.idPadre = idPadre;
    }

    public int getIdMadre() {
        return idMadre;
    }

    public void setIdMadre(int idMadre) {
        this.idMadre = idMadre;
    }
}
