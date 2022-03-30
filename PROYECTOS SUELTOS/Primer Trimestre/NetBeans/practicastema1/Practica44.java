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
public class Practica44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        boolean check = false;
        System.out.println("Introduce un número del 1 al 20");
        int num = sc.nextInt();
        check = !(num >= 1 && num <= 20);
        System.out.println("Numero incorrecto");
        
        while (check){
            System.out.println("Introduzca un número del 1 al 20");
            num = sc.nextInt();
            check = !(num >= 1 && num <= 20);
        }
        
        int potencia = 1;
        
        for (int i = 1; i <= 5; i++){
            potencia *= num;
            System.out.println(num + "^" + i + " = " + potencia);
        }
    }
}
