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
class Bus extends Vehiculo{
public int asientos;
public Bus(String matricula, double cilindrada,int asientos) {
super(matricula, cilindrada);
this.asientos=asientos;
}
}