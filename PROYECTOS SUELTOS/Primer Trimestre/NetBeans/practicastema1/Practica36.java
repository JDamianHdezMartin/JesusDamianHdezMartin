/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicastema1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author JDamian Hdez Martin
 */
public class Practica36 {
    public static void main(String[] args) {
        
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;
        
        
        do{
            int dado1 = rnd.nextInt(6) + 1;
            int dado2 = rnd.nextInt(6) + 1;
            int dado3 = rnd.nextInt(6) + 1;
            System.out.println("Dado1 = " + dado1);
            System.out.println("Dado2 = " + dado2);
            System.out.println("Dado3 = " + dado3);
            int sumaDados = (dado1 + dado2 + dado3);
            System.out.println("Total: " + sumaDados);
            
            System.out.println("Quieres continuar?");
            System.out.println("Si qiuere acabar pulse F");
            
        }while( sc.nextLine().toLowerCase().charAt(0) != 'f' );
    }
}
