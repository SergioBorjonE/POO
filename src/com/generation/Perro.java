package com.generation;

public class Perro {
    String nombre;
    String raza;
    int edad;
    String tamanio;

    /*Constructor vacío sirve para instanciar un objeto y agregar sus
    características llamandolas despues*/
    public Perro(){
    }

    /*Constructor de 1 parámetro al instanciar tenemos que alimentar
     al objeto con un parametro en este ejemplo con el nombre*/
    public Perro(String nombre){
        this.nombre=nombre;
    }

    /*Constructor de multiples parametros similar al caso anterior
    pero con todos los atributos de la clase*/
    public Perro (String nombre, String raza, int edad, String tamanio){
        this.nombre=nombre;
        this.raza=raza;
        this.edad=edad;
        this.tamanio=tamanio;
    }

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
