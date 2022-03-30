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
public class Polimorfismo {

    public static void main(String[] args) {
        Vehiculo array[] = new Vehiculo[2];
        Moto moto = new Moto("xmn-2532", 230);
        Bus bus = new Bus("jtr-8932", 3200, 40);
        Vehiculo vehiculo = moto;
        System.out.println(vehiculo.getClass());
        array[0] = vehiculo;
        vehiculo = bus;
        array[1] = vehiculo;
        for (Vehiculo elemento : array) {
            if (elemento instanceof Moto) {
                Moto m = (Moto) elemento;
                System.out.println("tiene sidecar: " + m.sidecar);
            }
        }
    }
}
