/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entregaspracticas;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Practica21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Dame un numero entero");
            Scanner cin= new Scanner(System.in);
            int num = cin.nextInt();
            if(num % 3 ==0){
                System.out.println("es multiplo de 3");
            }
            if (num % 5 ==0){
                System.out.println("es múltiplo de 5");
            }else
                System.out.println("No es múltiplo ni de 3 ni de 5");               
}}
    

