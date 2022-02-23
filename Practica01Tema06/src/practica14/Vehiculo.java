/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica14;

/**
 *
 * @author alumno
 */
abstract class Vehiculo {

    public String matricula;
    public double cilindrada;

    public Vehiculo(String matricula, double cilindrada) {
        this.matricula = matricula;
        this.cilindrada = cilindrada;
    }
}
