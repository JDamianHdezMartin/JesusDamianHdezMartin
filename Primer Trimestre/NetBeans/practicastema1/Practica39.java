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
public class Practica39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        boolean check = false;
        System.out.println("Introduzca un número entre 10 y 99");
        int num = sc.nextInt();
        check = !(num >= 10 && num <= 99);
        System.out.println("Numero incorrecto");
        
        while (check){
            System.out.println("Introduzca un número entre 10 y 99");
            num = sc.nextInt();
            check = !(num >= 10 && num <= 99);
        }
        
        int numInvertido = 0;

        if (num >= 10 && num <= 99) {
            int resto = num % 10;
            int cociente = num / 10;
            numInvertido = resto * 10 + cociente;
        }
        System.out.println(numInvertido);
    }
}
