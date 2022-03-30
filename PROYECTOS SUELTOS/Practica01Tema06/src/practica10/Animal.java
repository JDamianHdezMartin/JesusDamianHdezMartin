/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica10;

/**
 *
 * @author alumno
 */
public abstract class Animal {

    protected String nombre;
    protected int edad;
    protected int peso;

    public Animal() {
        System.out.println("jajaja! soy un animal!!!!");
    }

    public Animal(String nombre, int edad, int peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }
    
}
