package org.example.ejercicio14.clases;

public interface ISexual {

    //public String getSexo();

   // public void setSexo(String sexo);

    /*Como no me gusta que sea uan entrada "libre" en forma de String el sexopensé en pasar
    un booleano de ver si el genero es masculino o no. Podría existir el problema de querer
    permitir que sean hermafroditas, en ese caso intenté solucionarlo poniendo un enumerate
    por algún lado (alguna de las clases de la herencia) pero nada me salía bien.
     */
    public boolean isMasculino();

    public void setMasculino(boolean masculino);
}
