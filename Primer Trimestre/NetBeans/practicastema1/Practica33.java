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
public class Practica33 {
    public static void main(String[] args) {
        
        int intentos = 3;
        int pin = 1234;
        System.out.println("Introduzca la clave");
        Scanner sc = new Scanner(System.in);
        int intento = sc.nextInt();
        
        if(intento == pin){
            System.out.println("Bienvenido");
        }
        
        while(intento != pin){
            intentos = intentos - 1;
            System.out.println("Incorrecto, quedan " + intentos + " intentos");
            intento = sc.nextInt();
            if( intentos == 1){
                System.out.println("Buen intento");
                break;
            }
        }
    }
}
