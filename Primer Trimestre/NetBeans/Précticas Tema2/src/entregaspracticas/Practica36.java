/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entregaspracticas;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Practica36 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Random rnd= new Random();
       Scanner sc = new Scanner(System.in);
       boolean continuar=true;
       do{
           int dado1= rnd.nextInt(6) +1;
           int dado2=rnd.nextInt(6)+1;
           int dado3=rnd.nextInt(6)+1;
           System.out.println("dado1: "+ dado1);
           System.out.println("dado2: "+ dado2);
           System.out.println("dado3: "+ dado3);
           int sumaDados = (dado1+dado2+dado3);
           System.out.println(sumaDados);
           System.out.println("quieres continuar?");
           System.out.println("pulsa f si quieres acabar");
       }while (sc.nextLine().toLowerCase().charAt(0)!='f'){
               continuar = false;
               
           }
       }
    }
    

