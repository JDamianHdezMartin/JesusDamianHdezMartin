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
public class IVA {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el precio del producto");
        
        final double IVA = 0.21;
        double numero = sc.nextDouble(); sc.nextLine();
        
        double numeroIVA = numero + numero * IVA;
        
        System.out.println("El precio del producto con IVA es: " + numeroIVA);
        
    }
}
