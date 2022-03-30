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
public class PracticaTablas {
    public static void main(String[] args) {
        
        System.out.println("Introduzca un número");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        
        System.out.println("Introduzca otro número");
        int num2 = sc.nextInt();
        
        if(num1 > num2){
            int aux = num2;
            num2 = num1;
            num1 = aux;
        }
        
        int j = num1;
        
        do {
            
            int tabla = j;
            
            System.out.println("Tabla del: " + tabla);
            
            int i = 1;
            
            while (i < 11) {
                String filaTabla = tabla + " * " + i + " = " + (tabla * i);
                System.out.println(filaTabla);
                i++;
            }
            
            j++;
            
        } while(j <= num2);
        
    }
    
}
