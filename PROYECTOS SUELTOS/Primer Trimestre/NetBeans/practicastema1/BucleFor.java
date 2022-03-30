/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicastema1;

/**
 *
 * @author JDamián Hdez Martin
 */
public class BucleFor {
    public static void main(String[] args) {
        
        for( int i = 0, j = 1 ; i <= 10 ; i++, j *= 2 ){
            
            System.out.println("La potencia de " + i + " de base 2 es " + j);
            
        }
    }
}
