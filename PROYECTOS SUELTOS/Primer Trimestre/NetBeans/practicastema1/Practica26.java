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
public class Practica26 {
    public static void main(String[] args) {
        
        System.out.println("Introduzca un día de la semana");
        System.out.println("L=1 M=2 X=3 J=4 V=5");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        switch(num){
            case 1: System.out.println("A primera toca FOL");
                break;
            case 2: System.out.println("A primera toca SSF");
                break;
            case 3: System.out.println("A primera toca FOL");
                break;
            case 4: 
            case 5: System.out.println("A primera toca LNT");
                break;
            default: System.out.println("Los findes no hay clase");
        }
        
    }
}
