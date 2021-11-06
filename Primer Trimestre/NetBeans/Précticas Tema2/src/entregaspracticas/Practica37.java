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
public class Practica37 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int billete=500;
        int total=0;
        while(billete>=5){
            int cantBilletes;
            System.out.println("cuántos billetes de " + billete + "?");
            cantBilletes = sc.nextInt();
            total+=cantBilletes * billete;
            int auxiliar = billete;
            int potencia=1;
            while(auxiliar % 10==0){
                auxiliar /=10;
                potencia *=10;
        }switch (auxiliar) {
                case 5:
                    billete = 2*potencia;
                    break;
                case 2:
                    billete =1*potencia;
                    break;
                case 1:
                    billete=5*potencia/10;
                    break;
                default:
                    break;
            }
            
        }System.out.println(total);
    
}}
