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
public class Practica24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("¿Cuál es su idioma preferido?");
        System.out.println("‘c’ será castellano, ‘i’ inglés y‘f’ francés.");
        char A = cin.next().charAt(0);
        
        switch (A){
            case 'c': System.out.println("Buenos días");
            break;
            case 'i': System.out.println("Good morning");
            break;
            case 'f': System.out.println("Bonjour");
            break;
        }
        
        }
    }
    

