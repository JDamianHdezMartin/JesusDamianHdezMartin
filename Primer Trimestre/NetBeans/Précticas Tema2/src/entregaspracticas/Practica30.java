/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entregaspracticas;
import java.util.Scanner;
/**
 *
 * @author Damián
 */
public class Practica30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       do{
           int rango = 20 - 10;
           int aleatorio = (int)(rango*Math.random())+20;       
           System.out.println(aleatorio);
       }while(sc.nextLine().toLowerCase().charAt(0)=='c');
       }
    }
    
