package org.example.ejercicio21.clases;

import org.example.ejercicio13.clases.Animal;

import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;

public class GenerarAbuelos {

    public static ArrayList<Animal> generarAbuelos(int id) {
        Map<Integer,Animal> listaAnimales= Animal.getIdAnimalRef();
        ArrayList<Animal> abuelos=new ArrayList<>();
        Animal a= listaAnimales.get(id);
        if (a.getGeneracion() == 1) {
            return null;
        }
        if (a.getPadre().getGeneracion() == 1) {
            abuelos.add(a.getPadre());
            return abuelos;
        } else if (a.getMadre().getGeneracion() == 1) {
            int idPadre=a.getPadre().getId();
            abuelos.addAll(generarAbuelos(idPadre));
            return abuelos;
        } else {
            int idPadre=a.getPadre().getId();
            int idMadre=a.getMadre().getId();
            abuelos.addAll(generarAbuelos(idPadre));
            abuelos.addAll(generarAbuelos(idMadre));
            return abuelos;
        }
    }

}
