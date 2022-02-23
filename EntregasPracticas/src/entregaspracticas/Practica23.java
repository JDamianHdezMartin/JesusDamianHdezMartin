/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entregaspracticas;

import java.util.Scanner;

/**
 *
 * @author JDamián
 */
public class Practica23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   System.out.println("Introduce el valor de A");
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        if (a==0){
            System.out.println("El valor de a no puede ser igual a 0");
        }else{
        System.out.println("Introduce el valor de B");
        double b=sc.nextDouble();
        System.out.println("Introduce el valor de C");
        double c=sc.nextDouble();
        double numRaiz =(b*b-4ac);
        if (numRaiz<0){
            System.out.println("No hay solución real");
        }else{
            double raiz=Math.sqrt(numRaiz);
            double ecuacion1=(-b+raiz)/(2a);
            double ecuacion2=(-b-raiz)/(2*a);
            System.out.println("El resultado de la ecuación "+ ecuacion1);
            System.out.println("El resultado de la ecuación "+ecuacion2);
        }

    }
}
}
