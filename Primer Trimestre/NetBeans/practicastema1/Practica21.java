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
public class Practica21 {
    public static void main(String[] args) {
        
        System.out.println("Introduzca un número");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        if(num % 3 == 0 && num % 5 == 0){ 
            System.out.println("El numero es múltiplo de 3 y de 5");
        }else if(num % 3 == 0 && num % 5 != 0){
            System.out.println("El número es multiplo de 3 pero no de 5");
        }else if(num % 3 != 0 && num % 5 == 0){
            System.out.println("El número es múltiplo de 5 pero no de 3");
        }else if(num % 3 != 0 && num % 5 !=0){
            System.out.println("El número no es múltiplo de 3 ni de 5");
        }
    }
}
