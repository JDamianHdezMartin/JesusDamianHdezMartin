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
public class Practica45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca un número");
        int num = sc.nextInt();
        
        System.out.println("La descomposición de " + num + " es:");
        
        for( int divisor = 2; divisor <= num; divisor++){
            int contador = 0;
            
            while(num % divisor == 0){
                num = num / divisor;
                contador = contador + 1;
            }
            
            if(contador != 0){
                System.out.println(divisor + "^" + contador);
            }
        }
        
    }
}
