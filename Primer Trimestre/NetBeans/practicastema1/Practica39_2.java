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
public class Practica39_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
                System.out.println("Introduce un número");
        int num = sc.nextInt();
        
        String reverse= "";
        String numStr = "" + num;
        
        for ( int i = numStr.length() -1; i >= 0; i--){
            
            reverse = reverse + numStr.charAt(i);
            
        }
        
        Integer.parseInt(reverse);
        
        System.out.println(reverse);
    }
}
