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
class Moto extends Vehiculo{
public boolean sidecar;
public Moto(String matricula, double cilindrada) {
super(matricula, cilindrada);
sidecar=false;
}
}
