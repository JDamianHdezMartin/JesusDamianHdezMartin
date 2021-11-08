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
public class Practica38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca el número de horas");
        double dHoras = sc.nextDouble();
        
        double dDias = dHoras / 24;
        
        int dias = (int)dDias;
        dHoras = (dDias - dias) * 24;
        int horas = (int)dHoras;
        double dMinutos = (dHoras - horas) * 60;
        int minutos = (int)dMinutos;
        int segundos = (int)((dMinutos - minutos) * 60);
        
        System.out.print(dias + " dias "); System.out.print(horas + " horas "); 
        System.out.print(minutos + " minutos "); System.out.println(segundos + " segundos");
        
    }
}
