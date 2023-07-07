package org.example.ejercicio19.clases;

import org.example.ejercicio13.clases.*;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class GenerarCSV {
    public static void generarCSV(ArrayList<Animal> listaAnimales) {
        File file = new File("salida.csv");
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new FileWriter(file));
            pw.println("Id,Nombre,Tipo,Padre,Madre,Propietario,Generacion,Genero");
            for (Animal i : listaAnimales) {

                //condiciones ternarias variable si ()?->verdadero entonces primeraSentencia: y ()?->falso entonces segunda sentencia
                String padre = i.getPadre() == null ? "0" : String.valueOf(i.getPadre().getId());
                String madre = i.getMadre() == null ? "0" : String.valueOf(i.getMadre().getId());
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
