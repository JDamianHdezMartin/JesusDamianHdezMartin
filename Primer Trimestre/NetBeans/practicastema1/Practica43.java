/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicastema1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author JDamian Hdez Martin
 */
public class Practica43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        
        int secreto = rnd.nextInt(99)+1;
        int intentos = 0;
        boolean acierto = false;
        
        System.out.println("Introduzca un número");
        int num = sc.nextInt();
        
        do{
            if (num > secreto){
                System.out.println("Secreto < " + num);
                intentos += 1;
                num = sc.nextInt();
            }else if (num < secreto){
                System.out.println("Secreto > " + num);
                intentos += 1;
                num = sc.nextInt();
            }else if (num == secreto){
                intentos += 1;
                System.out.println("Acertaste! El número secreto era: " + secreto);
                System.out.println("Usaste " + intentos + " intentos para acertar");
                acierto = true;
            }  
        }while (acierto == false);
    }
}
