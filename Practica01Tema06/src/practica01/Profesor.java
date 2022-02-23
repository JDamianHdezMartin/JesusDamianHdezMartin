/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica01;

/**
 *
 * @author JDamián
 */
public class Profesor extends Persona {
    int salario;
    String especialidad;

    public Profesor(int salario, String especialidad, String nombre, String apellidos) {
        super(nombre, apellidos);
        this.salario = salario;
        this.especialidad = especialidad;
    }
}
