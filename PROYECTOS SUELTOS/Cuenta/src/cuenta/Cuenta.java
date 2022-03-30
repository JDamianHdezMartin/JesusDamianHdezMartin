/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuenta;

import java.util.Scanner;

/**
 *
 * @author JDamian
 */
public class Cuenta {
    String titular;
    double cantidad;

    public Cuenta() {
    }
    
    public double ingresar(double cantidad){
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la cantidad a ingresar");
        cantidad = sc.nextDouble();
*/
        if (cantidad >0) {
             
        }
        return 0;
    } 

    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }
    
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCuenta() {
        return cuenta;
    }

    public void setCuenta(double cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "titular=" + titular + ", cuenta=" + cuenta + '}';
    }
    
}
