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
public class Practica20 {
    public static void main(String[] args) {
        
        System.out.println("Introduzca un número");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        if(num % 2 == 0){
            System.out.println("El número es par");
    }else{
            System.out.println("El número es impar");
        }
    }    
}
