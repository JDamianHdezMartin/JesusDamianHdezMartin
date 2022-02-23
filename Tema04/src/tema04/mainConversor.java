/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema04;

/**
 *
 * @author JDamián
 */
public class mainConversor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conversor Conversor = new Conversor(1.13);
        System.out.println("50 euros en dolares es: ");
        Conversor.euroToDolar(50);
        System.out.println("50 dolares en euros es: ");
        Conversor.dolarToEuro(50);
    }
    
}
