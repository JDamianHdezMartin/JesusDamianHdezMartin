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
public class Practica18 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el número de horas semanales");
        double numHoras = sc.nextDouble();
        
        double total = 18 * numHoras;
        
        System.out.println("El trabajador cobra semanalmente " + total + "€");
        
    }
}
