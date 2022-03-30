/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicastema1;

/**
 *
 * @author JDamian Hdez Martin
 */
public class Practica29 {
    public static void main(String[] args) {
        
        System.out.println("Tabla del: 5");
        
        int i = 1;
        
        do {
            
            while (i < 11) {
                String filaTabla = 5 + " * " + i + " = " + (5 * i);
                System.out.println(filaTabla);
                i++;
            }
            
        } while(i < 10);
        
    }
}
