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
public class Practica33_2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String linea = sc.nextLine();
        int digito = (int)linea.charAt(0) - (int)'0';
        int longNum = linea.length();
        
        if(digito >= 0 && digito <= 9){
            System.out.println("Dígito correcto");
            System.out.println(digito);
        }else{
            System.out.println("El carácter introducido no es un número");
        }
        
        /*
        for(int i = 3; i > 0 && !pinAcertado; i--){
            int multiplicador = 1000;
            int posiblePin = 0;
            System.out.println("Dame el posible PIN de 4 dígitos");
            String linea = sc.nextLine();
            if(linea.length() == 4){
                int numero = Integer.parseInt(linea);
            }
        }
        */
    }
}
