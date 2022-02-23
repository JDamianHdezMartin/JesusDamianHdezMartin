/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("Dame el precio");
    final double IVA=0.21;
    int numero = (int) sc.nextDouble();
    double numeroConIva = numero + (numero*IVA);
        System.out.println("Resultado es " + numeroConIva);  
        }
    }
    
