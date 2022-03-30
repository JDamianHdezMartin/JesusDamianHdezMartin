/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entregaspracticas;
import java.util.Scanner;
/**
 *
 * @author JDamián
 */
public class ParseInt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Dame un número");
        Scanner sc=new Scanner(System.in);
        String strNumero;
        strNumero= sc.nextLine();
        //strNumero= "47318";
        int sumaTotal = 0;
        int i=0;
        int sizeNumero = strNumero.length();

        while (i < sizeNumero){
            int digito = strNumero.charAt(i) - '0';
            double sumando = digito *(int)Math.pow(10, sizeNumero -i -1);
            sumaTotal += sumando;
            i++;
        }
            System.out.println(sumaTotal);
            
        }
    }
    

