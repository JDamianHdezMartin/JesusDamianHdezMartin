/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package partidopoliticop29;

/**
 *
 * @author JDamián
 */
public class Votante {
    int dni;
    char letraDni;
    String nombre;

    public Votante(int dni, char letraDni, String nombre) {
        this.dni = dni;
        this.letraDni = letraDni;
        this.nombre = nombre;
    }
}
