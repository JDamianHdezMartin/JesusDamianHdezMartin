/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entregaspracticas;

import java.util.Scanner;

/**
 *
 * @author J.Damián
 */
public class PracticaExtra {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce dos números enteros ");

        int num1 = sc.nextInt();
        System.out.println("Dame el número que falta");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            int aux = num2;
            num2 = num1;
            num1 = aux;
        }

        do {
            int i = 1;
            int tabla = num1;
            System.out.println("Tabla de multiplicar del: " + num1);
            while (i < 11) {
                String filaDetabla = "" + tabla + " * " + i + " = " + tabla * i;
                System.out.println(filaDetabla);
                i++;
            }
            num1++;

            System.out.println(" ");
        } while (num1 <= num2);

    }

}
