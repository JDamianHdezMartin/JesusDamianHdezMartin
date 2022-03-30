/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioslambdasstream;

/**
 *
 * @author carlos
 */
public class Mujer extends Persona{
    
    
    public Mujer(String nombre, String ape1, int edad, int altura, double peso){
        super(nombre, ape1, edad, altura, peso);
    }
    
    @Override
    public double calcularPesoIdeal(){
        // altura - 100 - ( (100 - 150)/k )   
        // siendo k=4 si hombre y k=2 si mujer
        return this.alturaEnCm - 100 - ( (this.alturaEnCm - 150)/(double)2 );
    }
    
    
    @Override
    public String toString(){
        return super.toString() + " Peso Ideal: " + calcularPesoIdeal();
    }
    
    
}
