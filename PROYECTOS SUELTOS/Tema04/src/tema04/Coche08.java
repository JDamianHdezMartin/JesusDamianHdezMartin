/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema04;

import java.util.Random;

/**
 *
 * @author JDamián
 */
public class Coche08 {
    private String nombre;
    private boolean encendido;
    private boolean frenoDeManoPuesto;
    private int posicion;
    private final int ROADSIZE = 50;
    private boolean apagar;
    
    public Coche08(String nombre, int posicion){
    this.nombre=nombre;
    this.posicion=posicion;
    this.frenoDeManoPuesto = true;
    this.encendido = false;
    this.apagar = true;
        System.out.println("estoy en el contructor con 2 parámetros");
    }
    public Coche08(String nombre){
    this.nombre=nombre;
    this.frenoDeManoPuesto = true;
    Random rnd = new Random();
    this.posicion = rnd.nextInt(ROADSIZE);
    }
    
    public String getNombre() {
        return nombre;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public boolean isFrenoDeManoPuesto() {
        return frenoDeManoPuesto;
    }

    public void setFrenoDeManoPuesto(boolean frenoDeManoPuesto) {
        this.frenoDeManoPuesto = frenoDeManoPuesto;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public boolean isApagar() {
        return apagar;
    }

    public void setApagar(boolean apagar) {
        this.apagar = apagar;
    }
           public String encender(){
        String respuesta="";
        if( this.encendido){
            respuesta = "error el coche está ya encendido";
        }else{
            this.encendido = true;
            respuesta = "OK coche arrancado";
        }
        return respuesta;
    }
           public void avanzar(){
        if (this.posicion >= 0 && this.posicion < 50 && this.encendido && !this.frenoDeManoPuesto){
            this.posicion += 1;
            System.out.println("\nHas avanzado");
        } else {
            System.out.println("\nNo se puede avanzar");
        }
    }
}
