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
public class Practica46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca un número");
        int num = sc.nextInt();
        int aux = num;
        int resto;
        String strBinario = "";
        
        for(aux = num; aux > 1; aux = aux / 2){
            resto = aux % 2;
            strBinario = resto + strBinario;
        }
        strBinario = aux + strBinario;
        System.out.println(strBinario);
    }
}
