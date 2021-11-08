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
public class Practica37 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int bTotal = 0;
        
        System.out.println("Cuantos billetes de 500 tiene?");
        int b500 = sc.nextInt() * 500;
        
        System.out.println("Cuantos billetes de 200 tiene?");
        int b200 = sc.nextInt() * 200;
        
        System.out.println("Cuantos billetes de 100 tiene?");
        int b100 = sc.nextInt() * 100;
        
        System.out.println("Cuantos billetes de 50 tiene?");
        int b50 = sc.nextInt() * 50;
        
        System.out.println("Cuantos billetes de 20 tiene?");
        int b20 = sc.nextInt() * 20;
        
        System.out.println("Cuantos billetes de 10 tiene?");
        int b10 = sc.nextInt() * 10;
        
        System.out.println("Cuantos billetes de 5 tiene?");
        int b5 = sc.nextInt() * 5;
        
        bTotal = (b500 + b200 + b100 + b50 + b20 + b10 + b5);
        
        System.out.println("Tiene un total de " + bTotal + "€");
    }
}
