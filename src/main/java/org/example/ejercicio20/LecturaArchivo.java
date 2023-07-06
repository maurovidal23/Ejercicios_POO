package org.example.ejercicio20;

import org.example.ejercicio13.clases.Animal;
import org.example.ejercicio13.clases.Gato;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class LecturaArchivo {
    public static ArrayList<Animal> lerArchivo(){
        BufferedReader br = null;
        ArrayList<String> listaFilas = new ArrayList<>();
        try {
            br = new BufferedReader(new FileReader("salida.csv"));
            String linea;
            while ((linea = br.readLine()) != null) {
                listaFilas.add(linea);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != br) {
                    br.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        //listaFilas.remove(listaFilas.size()-1);
        ArrayList<Animal> listaAnimales = new ArrayList<>();
        //tenemos en este momento una lista que contiene en cada entrda el String de una fila=un animal
        for (String i : listaFilas) {
            //System.out.println(i);
            String[] parts = i.split(",");
            if (parts[2].equals("GATO")) {
                int id = Integer.valueOf(parts[0]);
                boolean masculino = Boolean.valueOf(parts[7]);
                //String padre = i.getPadre() == null ? "" : String.valueOf(i.getPadre().getId());
                int idPadre = parts[3].equals("") ? 0 : Integer.valueOf(parts[3]);
                int idMadre = parts[4].equals("") ? 0 : Integer.valueOf(parts[4]);
                int generacion = Integer.valueOf(parts[6]);

                Gato g = new Gato(id, masculino, idPadre, idMadre, generacion, parts[1], parts[5]);
                //System.out.println(g);
                listaAnimales.add(g);
            }
        }
        return listaAnimales;
    }

}
