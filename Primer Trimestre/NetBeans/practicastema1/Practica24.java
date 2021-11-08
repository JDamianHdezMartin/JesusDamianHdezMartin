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
public class Practica24 {
    public static void main(String[] args) {
        
        System.out.println("¿Cual es tu idioma preferido?");
        System.out.println("'c' Castellano");
        System.out.println("'i' Inglés");
        System.out.println("'f' Francés");
        Scanner cin = new Scanner(System.in);
        char letra = cin.next().charAt(0);
        
        switch(letra){
            case 'c': System.out.println("Buenos Días");
                break;
            case 'i': System.out.println("Good Morning");
                break;
            case 'f': System.out.println("Bonjour");
                break;
            default: System.out.println("No entiendo tu idioma");
        }
    }
}
