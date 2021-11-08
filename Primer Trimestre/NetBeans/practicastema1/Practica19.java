/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicastema1;

import java.util.Scanner;

/**
 *
 * @author JDamian Hdez Martin
 */
public class Practica19 {
    public static void main(String[] args) {
        
        System.out.println("Menú:");
        System.out.println("1.- Pasar de Farenheit a Celcius");
        System.out.println("Otro número: Pasar de Celcius a Farenheit");
        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt(); sc.nextLine();
        
        if( opcion == 1){
            System.out.println("Dame los Farenheit");
            int tempF = sc.nextInt();
            double tempC = (tempF - 32) * 5 / 9.0;
            System.out.println("Serán " + tempC + "Celcius");
        }else{
            System.out.println("Dame los Celcius");
            int TempC = sc.nextInt();
            double TempF = TempC * 9 / 5.0 + 32;
            System.out.println("Serán " + TempF + "Farenheit");
            
        }
    }
}
