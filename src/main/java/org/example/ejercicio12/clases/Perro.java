package org.example.ejercicio12.clases;

import org.example.ejercicio10.clase.Animal;
import org.example.ejercicio11.clases.Mascota;

public class Perro extends Mascota {

    public Perro(String raza, String nombre, String propietario) {
        super(REINO.MAMIFERO, TIPO.PERRO, raza, MEDIO.TERRESTRE, nombre, propietario);
    }
}
