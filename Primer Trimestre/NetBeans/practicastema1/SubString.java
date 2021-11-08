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
public class SubString {
    public static void main(String[] args) {
        /*
        String num = "1234";
        
        String substring = num.substring(0,4);
        int digito = Integer.parseInt(substring);
        System.out.println(digito);
        */
        
        String strNum ="10110111";
        int i = 0;
        int resultado = 0;
        
        while (i < strNum.length()){
            String substring = strNum.substring(i, i+1);
            int digito = Integer.parseInt(substring);
            int potencia2 = strNum.length() - 1 - i;
            resultado += digito * (int)Math.pow(2, potencia2);
            i++;
        }
        System.out.println(resultado);
    }
}
