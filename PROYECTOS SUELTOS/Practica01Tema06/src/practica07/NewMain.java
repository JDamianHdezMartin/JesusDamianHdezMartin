/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica07;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cuenta c1 = new Cuenta("12345", "JDamián", 10000);
        System.out.println("Ingresa el dinero que desees");
        c1.Ingresar(sc.nextDouble());
        System.out.println(c1.saldo);
        System.out.println("Retira el dinero que desees");
        c1.Retirar(sc.nextDouble());
        System.out.println(c1.saldo);
    }
}
