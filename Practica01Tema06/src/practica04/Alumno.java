/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica04;

/**
 *
 * @author alumno
 */
public class Alumno extends Persona {

    String grupo;
    double notaMedia;

    public Alumno(String nombre, String apellidos, String grupo, double notaMedia) {
        super(nombre, apellidos);
        this.grupo = grupo;
        this.notaMedia = notaMedia;
    }
}
