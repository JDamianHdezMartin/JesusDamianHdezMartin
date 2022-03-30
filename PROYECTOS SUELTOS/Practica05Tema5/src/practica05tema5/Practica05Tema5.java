/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica05tema5;

import java.util.Scanner;



/**
 *
 * @author JDamián
 */
public class Practica05Tema5 {
    public static void mostrarArray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(" " + arr[i][j]);
            }
            System.out.println();
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();       
        int[][] array = new int [x][];
        for (int[] longitud : array) {
            for (int i = 0; i < longitud.length; i++) {
                int j = longitud[i];
                
            }
        }
        //array[i][j] = array[i-1][j-1] + array[i-1][j];
        
    }
    
    
}
