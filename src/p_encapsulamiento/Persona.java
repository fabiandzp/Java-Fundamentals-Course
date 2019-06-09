package p_encapsulamiento;

import jdk.nashorn.internal.runtime.OptimisticReturnFilters;

public class Persona {
    private String nombre;
    private String apellido;
    private boolean borrado;

    public Persona(){}

    public Persona(String nombre, String apellido, Boolean borrado){
        this.nombre = nombre;
        this.apellido = apellido;
        this.borrado = borrado;
    }

    public String getNombre(){
        return  this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido(){
        return this.apellido;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public boolean isBorrado(){
        return this.borrado;
    }

    public void setBorrado(boolean borrado){
        this.borrado = borrado;
    }

    //estado del objeto
    //toString es un metodo de la clase padre Object
    public String toString(){
        return "Nombre: "+nombre+" Apellido: "+apellido+" Borrado: "+borrado;
    }
}
