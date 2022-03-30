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
public class Practica41 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca una palabra");
        
        String texto = sc.nextLine();
        
        String strInvertido = "";
        for (int i = 0; i < texto.length(); i++) {

            strInvertido = texto.charAt(i) + strInvertido;

        }
        
        System.out.println(strInvertido);
    }
}
