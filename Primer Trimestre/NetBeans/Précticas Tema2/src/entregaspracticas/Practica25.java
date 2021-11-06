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
public class Practica25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Introduce una letra");
        char letra =cin.nextLine().toLowerCase().charAt(0);
        switch (letra){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':System.out.println("es una vocal");
            break;
            default: System.out.println("no es una vocal");
            break;
        }
            
    }
    
}
