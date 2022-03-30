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
public class Practica37_Bucle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int total = 0;
        int multiplicando = 5;
        int potencia = 100;
        int billete = potencia * multiplicando;
        
        while(billete >= 5){
            int cantBilletes;
            System.out.println("Cuantos de " + billete + " ?");
            total += sc.nextInt() * billete;
            if (multiplicando == 1){
                multiplicando = 5;
                potencia = 10;
            }else{
                multiplicando /= 2;
            }
            billete = multiplicando * potencia;
            
            /*
            billete /= 2;
            
            if(billete == 250){
                billete = 200;
            }else if (billete == 25){
                billete = 20;
            }
            
            while( auxiliar % 10 == 0){
                auxiliar /= 10;
                potencia *= 10;
            }
            if( auxiliar == 5){
                billete = 2 * potencia;
            }else if( auxiliar == 2){
                billete = 1 * potencia;
            }else if( auxiliar == 1){
                billete = 5 * potencia / 10;
            }
            */
        }
        System.out.println("Suma: " + total);
    }
}
