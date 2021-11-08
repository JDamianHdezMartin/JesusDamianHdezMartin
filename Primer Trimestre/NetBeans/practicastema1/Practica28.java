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
public class Practica28 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int sumaPos = 0;
        int sumaNeg = 0;
        int num = 0; 
        
        do{
            System.out.println("Introduce un número entero");
            
            num = sc.nextInt();
            
            if(num > 0){
                sumaPos += num;
            }else{
                sumaNeg += num;
            }
        }while(num != 0);
            System.out.println("La suma de positivos es " + sumaPos + " y la suma de negativos es " + sumaNeg);
    }
}
