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
public class Practica18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Introduce el número de horas trabajadas en la semana");
        double horas= cin.nextInt();
        System.out.println("Introduce el salario por hora");
        double salario= cin.nextInt();
        double Total=salario*horas;
        System.out.println(Total);
    }
    
}
