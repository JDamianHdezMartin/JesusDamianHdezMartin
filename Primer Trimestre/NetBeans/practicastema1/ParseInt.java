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
public class ParseInt {
    public static void main(String[] args) {
        //Falta hacerlo para numeros negativos
        System.out.println("Dame un número entero");
        Scanner sc = new Scanner(System.in);
        String strNumero;
        strNumero = sc.nextLine();
        //strNumero = "47318";
        int i = 0;
        int sizeNumero = strNumero.length();
        int sumaTotal = 0;
        
        while(i < sizeNumero){
            int digito = strNumero.charAt(i) - '0';
            int sumando = digito * (int)Math.pow(10, sizeNumero - i - 1);
            
            sumaTotal += sumando;
            i++;
        }
        
        System.out.println(sumaTotal);
        
        /* 
        Arriba estamos automatizando esto, para que sirva con cualquier número
        int sumaTotal = 0;
        
        int digito0 = strNumero.charAt(0) - '0';
        int sumando0 = (int)(digito0 * Math.pow(10,4));
        sumaTotal += sumando0;
        
        int digito1 = strNumero.charAt(1) - '0';
        int sumando1 = (int)(digito1 * Math.pow(10,3));
        sumaTotal += sumando1;
        
        int digito2 = strNumero.charAt(2) - '0';
        int sumando2 = (int)(digito2 * Math.pow(10,2));
        sumaTotal += sumando2;
        
        int digito3 = strNumero.charAt(3) - '0';
        int sumando3 = (int)(digito3 * Math.pow(10,1));
        sumaTotal += sumando3;
        
        int digito4 = strNumero.charAt(4) - '0';
        int sumando4 = (int)(digito4 * Math.pow(10,0));
        sumaTotal += sumando4;
        */
    }
}
