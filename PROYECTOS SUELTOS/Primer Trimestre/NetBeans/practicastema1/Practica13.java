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
public class Practica13 {
    public static void main(String[] args) {
        
        Scanner cin = new Scanner(System.in);
        System.out.println("Introduzca un número mayor que 5 ");
        int numero = cin.nextInt();
        boolean comparaCon5;
        comparaCon5 = numero > 5;
        System.out.println("Es " + comparaCon5 + " que el número sea mayor que 5");
        //Al introducir un número mayor que 5
        //La comparación que hace el boolean nos muetsra el valor true
        //Al introducir un número menor que 5 nos muetsra el valor false
        
    }
        
}
