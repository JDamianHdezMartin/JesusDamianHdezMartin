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
public class Practica30 {
    public static void main(String[] args) {
        
        System.out.println("Bienvenido al generador de números aleatorios");
        System.out.println("Si quiere generar otro numero aleatorio pulse 'C'");
        
        Scanner sc = new Scanner(System.in);
        
        do{
            int rang = 20 - 10;
            
            int aleatorio = (int)(rang * Math.random()) + 10;
            System.out.println(aleatorio);
            
        }while(sc.nextLine().toLowerCase().charAt(0) == 'c');
        
    }
}
