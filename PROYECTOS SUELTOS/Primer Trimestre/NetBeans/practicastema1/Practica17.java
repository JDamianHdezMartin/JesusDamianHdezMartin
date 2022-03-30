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
public class Practica17 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el precio del producto");

        final double IGIC = 0.07;
        double num = sc.nextDouble();
        sc.nextLine();

        double numeroIGIC = num + num * IGIC;

        System.out.println("El precio del producto con IGIC es: " + numeroIGIC);
        
    }
}
