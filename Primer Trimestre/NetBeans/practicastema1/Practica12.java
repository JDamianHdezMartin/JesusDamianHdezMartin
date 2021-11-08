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
public class Practica12 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Define A");
        int a = sc.nextInt();
        System.out.println("A = " + a);
        
        System.out.println("Define B");
        int b = sc.nextInt();
        System.out.println("B = " + b);
        
        System.out.println("Defina C");
        int c = sc.nextInt();
        System.out.println("C = " + c);
        
        int aux = b;
        b = a;
        a = c;
        c = aux;
        
        System.out.println("Tras el cambio:");
        System.out.println("A = " + a);
        System.out.println("b = " + b);
        System.out.println("C = " + c);
        
    }
}
