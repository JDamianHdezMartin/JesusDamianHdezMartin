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
public class Practica10 {
    public static void main(String[] args) {
        
        int x, y;
        x = 3;
        y = ++x;
        System.out.println("Resultado con prefijo: x =  " + x + " y = " + y);
        //En este caso tanto la x como la y valen 4
        //Ya que primero suma 1 a la variable x 
        //Y después asigna el valor a la variable
        
        x = 3;
        y = x++;
        System.out.println("Resultado con postfijo: x =  " + x + " y = " + y);
        //En este caso la x vale 4, sin embargo la y vale 3
        //Ya que primero asigna el valor de la variable y despues hace la suma
        //Dando como resultado el valor de la variable asignada al inicio
    }
}
