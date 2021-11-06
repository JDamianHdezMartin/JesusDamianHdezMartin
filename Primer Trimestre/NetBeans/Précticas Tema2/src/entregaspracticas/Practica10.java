/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entregaspracticas;

/**
 *
 * @author alumno
 */
public class Practica10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int x,y;
       x=3;
       y=++x;
       System.out.println("Resultado con prefijo: x =  " + x + " y = " + y);
 
       x=3;
       y=x++;
       System.out.println("Resultado con postfijo: x = " + x + " y =  " + y);
    }
    
}
