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
public abstract class Persona {
    protected String nombre;
    protected String apellido1;

    protected int edad;
    protected int alturaEnCm;
    protected double pesoEnKg;
    
    public Persona(String nombre, String ape1, int edad, int altura, double peso){
        this.nombre = nombre;
        this.apellido1 = ape1;

        this.edad = edad;
        this.alturaEnCm = altura;
        this.pesoEnKg = peso;
    }
    
    
    protected double calcularIMC(){
        return pesoEnKg/(Math.pow(alturaEnCm/(double)100,2));
    }
    protected abstract double calcularPesoIdeal();
    @Override
    public String toString(){
        return "Nombre completo: " + nombre + " " + apellido1 + " " 
                + " Edad: " + edad + " Altura: " + alturaEnCm + " Peso: " + pesoEnKg + " IMC: " + calcularIMC();
    }

}
