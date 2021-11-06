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
public class Practica17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Introduce el precio");
        double precio = cin.nextInt();
        double IGIC=0.07*precio;
        double total = precio + IGIC;
        System.out.println("Precio con IGIC: " + total );
    }
    
}
