/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilacolalista;

public class ColaString {
    private String array[];
    private int nextFree;
    private int nextPorAtender;
    
    public ColaString(int size){
        array = new String[size];
    }
    
    @Override
    public String toString(){
        String coma = "";
        String respuesta = "";
        for(int i = nextPorAtender; i < array.length && i < nextFree; i++){
            respuesta += coma + array[i];
            coma = ", ";
        }
        return respuesta;
    }
    
    public boolean agregar(String dato){
        boolean ok = false;
        if(nextFree < array.length){
            array[nextFree] = dato;
            nextFree++;
            ok = true;
        }
        return ok;
    }
    
    public String atender(){
        String dato = null;
        if(nextPorAtender < nextFree){
            dato = array[nextPorAtender];
            nextPorAtender++;
        }
        return dato;
    }
}

public class ColaPersona {
    private Persona array[];
    private int nextFree;
    private int nextPorAtender;
    
    public ColaPersona(int size){
        array = new Persona[size];
    }
    
    @Override
    public String toString(){
        String coma = "";
        String respuesta = "";
        for(int i = nextPorAtender; i < array.length && i < nextFree; i++){
            respuesta += coma + array[i];
            coma = ", ";
        }
        return respuesta;
    }
    
    public boolean agregar(Persona persona){
        boolean ok = false;
        if(nextFree < array.length){
            array[nextFree] = persona;
            nextFree++;
            ok = true;
        }
        return ok;
    }
    
    public Persona atender(){
        Persona persona = null;
        if(nextPorAtender < nextFree){
            persona = array[nextPorAtender];
            nextPorAtender++;
        }
        return persona;
    }
}

public class Persona {
    private String nombre;
    private String apellido;
    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public Persona(String nombre){
        this.nombre = nombre;
        apellido = "Anónimo";
    }
    
    @Override
    public String toString(){
        String respuesta = nombre + " " + apellido;
        return respuesta;
    }
}