/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema04;

/**
 *
 * @author JDamián
 */
public class Practica10 {
    
    public static void main(String[] args) {
        
    }
    
}
class Cuenta{
String numero;
String titula;
double saldo;
private double ingresar(double cantidad){
    this.saldo+=cantidad;
    return 0;

}
private double retirar (double cantidad){
    this.saldo-=cantidad;
    return saldo;

}


}

