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
public class Practica46 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero, exp, aux;
        double binario;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Introduce un numero entero >= 0: ");                                                
            numero = sc.nextInt();
        }while(numero < 0);
        exp=0;
        binario=0;
        while(numero!=0){
                aux = numero % 2;           
                binario = binario + aux * Math.pow(10, exp);                                                   
                exp++;
                numero = numero/2;
        }
        System.out.printf("Binario: %.0f %n", binario);
    }  //%.0f %n//
}