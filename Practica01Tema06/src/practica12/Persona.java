/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica12;

/**
 *
 * @author alumno
 */
abstract class Persona {

    String nombre;
    String apellido1;
    String appellido2;
    int edad;
    int altura;
    double peso;

    public Persona(String nombre, String apellido1, String appellido2, int edad, int altura, double peso) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.appellido2 = appellido2;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
    }

    protected double calcularIMC() {
        double altura1 = altura / 100.0;
        double resultado = (peso / (altura1 * altura1));
        return resultado;
    }

    abstract double calcularPesoIdeal();

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido1=" + apellido1 + ", appellido2=" + appellido2 + ", edad=" + edad + ", altura=" + altura + ", peso=" + peso + '}';
    }
    
}