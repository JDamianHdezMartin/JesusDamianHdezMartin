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
public class Practica37_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca la cantidad de dinero");
        int total = sc.nextInt();
        
        int aRepartir = total;
        
        for ( int potencia = 100; potencia >= 1; potencia /= 10 ){
            
            for (int multiplicando = 5; multiplicando >= 1; multiplicando /= 2){
                
                int billete = multiplicando * potencia;
                int cantidadBillete = aRepartir / billete;
                if (cantidadBillete > 0){
                    System.out.println(billete + " cantidad: " + cantidadBillete);
                    aRepartir = aRepartir - cantidadBillete + billete;
                }
            }
        }
    }
}
