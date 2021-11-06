/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entregaspracticas;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Practica32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca 2 números enteros positivos");
        int n1, n2, suma, aux;
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        suma=0;
        if (n1>n2) {
            aux=n2;
            n2=n1;
            n1=aux;
           }
        for (int i = n1; i < n2; i++) {
        suma+=i;    
        }
        System.out.println(suma);
    }    
}