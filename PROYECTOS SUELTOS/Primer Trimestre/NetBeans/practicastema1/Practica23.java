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
public class Practica23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dame 3 números");

        int a = sc.nextInt();
        System.out.println("A = " + a);
        int b = sc.nextInt();
        System.out.println("B = " + b);
        int c = sc.nextInt();
        System.out.println("C = " + c);
        double resultado1 = 0.0;
        double resultado2 = 0.0;

        if ((b * b) - 4 * a * c < 0) {
            System.out.println("No hay solución");
        } else {
            resultado1 = (-b + ((b * b) - 4 * a * c) / 2 * a);
            resultado2 = (-b - ((b * b) - 4 * a * c) / 2 * a);
        }
        if (resultado1 == resultado2) {
            System.out.println(resultado1);
            System.out.println(resultado2);
        } else {
            System.out.println(resultado1);
        }
        
    }
}
