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
public class Practica22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Introduce un número");
        Scanner sc=new Scanner(System.in);
        int x = sc.nextInt();
        if (x < 0){ 
            System.out.println("es menor de 0");
        }else if (x == 0){
            System.out.println("es igual a 0");
        }else if (x > 0 & x < 20){
            System.out.println("estáentre 0 y 20");
        }else if (x == 10){
            System.out.println("es igual a 10");
        }else if (x > 0 & x < 20){
            System.out.println("está entre 10 y 20");   
        }else if (x>=20){
            System.out.println("es mayor o igual a 20");
    }
    }
    
}
