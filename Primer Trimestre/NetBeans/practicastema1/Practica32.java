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
public class Practica32 {
    public static void main(String[] args) {
        
        System.out.println("Introduzca un número");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt(); sc.nextLine();
        
        System.out.println("Introduzca otro número");
        int num2 = sc.nextInt(); sc.nextLine();
        
        if(num1 > num2){
            int aux = num2;
            num2 = num1;
            num1 = aux;
        }
        
        int suma = 0;
        
        for( int i = num1 ; i<=num2 ; i++){
            suma += i; 
        }
        
        System.out.println(suma);
    }
}
