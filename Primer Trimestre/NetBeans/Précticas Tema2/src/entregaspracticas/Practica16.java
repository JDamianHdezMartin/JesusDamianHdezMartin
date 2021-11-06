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
public class Practica16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      Scanner cin = new Scanner(System.in);
      System.out.print("Introduce la longitud de la base en metros: ");
      int base = cin.nextInt();
      System.out.print("Introduce la longitud de la altura en metros: ");
      int altura = cin.nextInt();      
      int area= base * altura;
      System.out.println("el área es: " + area);
    }
    
}
