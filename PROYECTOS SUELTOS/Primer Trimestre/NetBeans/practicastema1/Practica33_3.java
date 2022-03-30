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
public class Practica33_3 {
    public static void main(String[] args) {
        
        System.out.println("Introduzca un PIN de 4 dígitos");
        Scanner sc = new Scanner(System.in);
        
        int secreto = 1234;
        int pin;
        
        boolean pinAcertado = false;
        
        for(int i = 3; i > 0 && !pinAcertado ; i--){ //Hacemos los 3 intentos de PIN
            
            int multiplicador = 1000;
            int posiblePin = 0;
            
            for(int k = 4; k > 0; k--){
                
                System.out.println("Introduzca el " + (5-k) + " dígito");
                int digito = sc.nextInt();
                if (digito >= 0 && digito < 10){
                    int dato = digito * multiplicador;
                    posiblePin += dato;
                    multiplicador /= 10;
                }else{
                    System.out.println("No es un dígito válido");
                    System.out.println("Vuelva a repetir");
                    k++;
                }
                
            }
            pinAcertado = posiblePin == secreto;
            
        }
        
        if(pinAcertado){
            System.out.println("Puede pasar");
        }else{
            System.out.println("Buen intento");
        }
        
    }
}
