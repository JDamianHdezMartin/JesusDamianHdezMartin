/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entregaspracticas;

import java.util.Scanner;

/**
 *
 * @author JDamián
 */
public class Practica19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner cin = new Scanner(System.in);
        System.out.println("Introduce los grados Farenheit");
        double F= cin.nextInt();
        double C =(F-32 )* 5/9;
        System.out.println("Los grados en Celsius son: " + C);                
    }
    
}
