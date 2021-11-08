/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicastema1;

/**
 *
 * @author JDamian Hdez Martin
 */
public class Practica39_3 {
    public static void main(String[] args) {
        
        int numero = 123456;
        int copiaNumero = numero;
        int potencia = 1;
        int acumulado = 0;
        
        while (copiaNumero > 0){
            int resto = copiaNumero % 10;
            copiaNumero /= 10;
            acumulado = acumulado * 10 + resto;
        }
        System.out.println(acumulado);
    }
}
