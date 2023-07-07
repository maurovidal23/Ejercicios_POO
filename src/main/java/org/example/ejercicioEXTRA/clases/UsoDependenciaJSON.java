package org.example.ejercicioEXTRA.clases;

import org.example.ejercicio13.clases.*;
import org.example.ejercicio20.clases.LecturaArchivo;
import org.json.CDL;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class UsoDependenciaJSON {

    public static void generarJSON(ArrayList<Animal> listaAnimales) {
        File file = new File("salidaJSON.json");
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new FileWriter(file));
            JSONArray listaAnimalesJSON = new JSONArray();


            for (Animal i : listaAnimales) {
                JSONObject obj= new JSONObject(i);
                listaAnimalesJSON.put(obj);
            }
            pw.println(listaAnimalesJSON);
        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            try {
                if (file != null) {
                    pw.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }


        }

    }
}