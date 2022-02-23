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
public class Practica13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner cin = new Scanner(System.in);
        System.out.println("Introduzca un número mayor que 5 ");
        int numero = cin.nextInt();
        boolean comparaCon5;
        comparaCon5 = numero > 5;
        System.out.println("Es " + comparaCon5 + " que el número sea mayor que 5");
    } 
    }
    

