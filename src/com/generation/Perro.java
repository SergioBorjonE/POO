package com.generation;

public class Perro {
    String nombre;
    String raza;
    int edad;
    String tamanio;

    public void caracteristicas(){
        String dat= " ";
        if(this.edad==1){
            dat=" año";
        } else{
            dat=" años";
        }
        System.out.println("Hola mi nombre es "+this.nombre+
                ", soy de raza "+this.raza+" tengo "+this.edad+ dat +" y soy de tamaño "
               +this.tamanio);
    }

    public void comer(){
        System.out.println("Estoy comiendo");
    }

    public void dormir(){
        System.out.println("ZzZzzz");
    }

    public void jugar(){
        System.out.println("Estoy jugando");
    }
}
