/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicastema1;

import java.util.Scanner;

/**
 *
 * @author JDamian Hdez Martin
 */
public class Practica40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        boolean check = false;
        System.out.println("Escriba un número entre 0 y 999");
        int num = sc.nextInt();
        check = !(num >= 0 && num <= 999);
        System.out.println("Numero incorrecto");
        
        while (check) {
            System.out.println("Escriba un número entre 0 y 999");
            num = sc.nextInt();
            check = !(num >= 0 && num <= 999);
        }
        
        int potencia = 0;
        
        if ( num >= 0 && num <= 999 ){
            while ( num > Math.pow(10, potencia)){
                potencia++;
            }
            System.out.println("Cantidad cifras: " + potencia);
        }
        
    }
}
