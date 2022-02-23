/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica06;

/**
 *
 * @author alumno
 */
public class Alumno extends Persona{
    int curso;

    public Alumno(int curso, String nombre, String apellidos) {
        super(nombre, apellidos);
        this.curso = curso;
    }
    @Override
    public void ImprimirDatos() {
        super.ImprimirDatos();
    }
}
