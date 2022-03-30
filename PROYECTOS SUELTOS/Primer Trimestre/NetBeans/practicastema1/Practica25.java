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
public class Practica25 {
    public static void main(String[] args) {
        
        System.out.println("Introduzca una letra");
        Scanner sc = new Scanner(System.in);
        String letra = sc.nextLine();
        String mayuscula = letra.toLowerCase();
        char l = letra.charAt(0);
        
        switch(l){
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U': System.out.println("Es una vocal");
                break;
            default: System.out.println("Es una consonante");
        }
    }
}
