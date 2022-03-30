/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica02;

/**
 *
 * @author JDamián
 */
public class Alumno extends Persona{
    int curso;
    int numeroClase;

    public Alumno(int curso, int numeroClase, String nombre, String apellidos) {
        super(nombre, apellidos);
        this.curso = curso;
        this.numeroClase = numeroClase;
        this.nombre = nombre;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public int getNumeroClase() {
        return numeroClase;
    }

    public void setNumeroClase(int numeroClase) {
        this.numeroClase = numeroClase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
}
