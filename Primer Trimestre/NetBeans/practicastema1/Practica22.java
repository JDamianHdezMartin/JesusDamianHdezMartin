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
public class Practica22 {
    public static void main(String[] args) {
        
        System.out.println("Dame un número");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        if(num <= 0)
            System.out.println(num + " es menor que 0");
        else if(num == 0)
            System.out.println(num + " es igual a 0");
        else if(num >=0 && num <=10)
            System.out.println(num + " es mayor que 0 y menor que 10");
        else if(num == 10)
            System.out.println(num + " es igual a 10");
        else if(num >= 10 && num <= 20)
            System.out.println(num + " es mayor que 10 y menor que 20");
        else if(num == 20 || num >= 20)
            System.out.println(num + " es igual o mayor que 20");
        
    }
}
