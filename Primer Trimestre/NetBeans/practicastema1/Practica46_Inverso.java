/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicastema1;

/**
 *
 * @author JDamian Hdez Martin
 */
public class Practica46_Inverso {
    public static void main(String[] args) {
        
        int num = 183;
        
        String strBinario = "10110111";
        int longNum = strBinario.length();
        
        int decimal = 0;
        for (int i = 0; i < longNum; i++){
            decimal += (strBinario.charAt(i) - '0') * (int)Math.pow(2, longNum - i - 1);
        }
        System.out.println(decimal);
    }
}
