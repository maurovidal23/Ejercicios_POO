package org.example.ejercicio14.clases;

import org.example.ejercicio13.clases.*;

import java.util.ArrayList;

public class GetListaAnimalesCreada {

    public static ArrayList<Animal> recuperarListaCreada1(){
        ArrayList<Animal> arcaNoe= new ArrayList<>();
        Gato g_mas= new Gato("persa",true,"Firulais","Noe");
        arcaNoe.add(g_mas);
        Gato g_fem=new Gato("persa", false, "María","Noe");
        arcaNoe.add(g_fem);
        Oveja o_mas= new Oveja("lanuda",true,"Noe");
        arcaNoe.add(o_mas);
        Oveja o_fem= new Oveja("lanuda",false, "Noe");
        arcaNoe.add(o_fem);
        Perro p_mas=new Perro("labrador",true,"Lucas","Noe");
        arcaNoe.add(p_mas);
        Perro p_fem=new Perro("labrador",false,"Espe","Noe");
        arcaNoe.add(p_fem);
        PezPayaso pp_mas= new PezPayaso("comun",true);
        arcaNoe.add(pp_mas);
        PezPayaso pp_fem=new PezPayaso("comun",false);
        Tucan t_mas=new Tucan("amazonico",true);
        arcaNoe.add(t_mas);
        Tucan t_fem= new Tucan("amazonico",false);
        arcaNoe.add(t_fem);
        Vaca v_mas=new Vaca("gallega",true, "Noe" );
        arcaNoe.add(v_mas);
        Vaca v_fem= new Vaca("gallega",false,"Noe");
        arcaNoe.add(v_fem);
        return arcaNoe;
    }
    public static ArrayList<Animal> recuperarListaCreada2(){
        ArrayList<Animal> arcaNoe= new ArrayList<>();
        Gato g_mas= new Gato("persa",true,"Firulais","Noe");
        arcaNoe.add(g_mas);
        Gato g_fem=new Gato("persa", false, "María","Noe");
        arcaNoe.add(g_fem);
        Gato g2_mas = new Gato("persa", true, "Gregorio", "Juan");
        arcaNoe.add(g2_mas);
        Oveja o_mas= new Oveja("lanuda",true,"Noe");
        arcaNoe.add(o_mas);
        Oveja o_fem= new Oveja("lanuda",false, "Noe");
        arcaNoe.add(o_fem);
        Perro p_mas=new Perro("labrador",true,"Lucas","Noe");
        arcaNoe.add(p_mas);
        Perro p_fem=new Perro("labrador",false,"Espe","Noe");
        arcaNoe.add(p_fem);
        PezPayaso pp_mas= new PezPayaso("comun",true);
        arcaNoe.add(pp_mas);
        PezPayaso pp_fem=new PezPayaso("comun",false);
        Tucan t_mas=new Tucan("amazonico",true);
        arcaNoe.add(t_mas);
        Tucan t_fem= new Tucan("amazonico",false);
        arcaNoe.add(t_fem);
        Vaca v_mas=new Vaca("gallega",true, "Noe" );
        arcaNoe.add(v_mas);
        Vaca v_fem= new Vaca("gallega",false,"Noe");
        arcaNoe.add(v_fem);
        return arcaNoe;
    }
    public static ArrayList<Animal> recuperarListaCreada3() {
        ArrayList<Animal> arcaNoe = new ArrayList<>();
        Gato g_mas = new Gato("persa", true, "Firulais", "Noe");
        arcaNoe.add(g_mas);
        Gato g_fem = new Gato("persa", false, "María", "Noe");
        arcaNoe.add(g_fem);
        Gato g2_mas = new Gato("persa", true, "Gregorio", "Juan");
        arcaNoe.add(g2_mas);
        return arcaNoe;
    }

}
