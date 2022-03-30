/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package camion;

/**
 *
 * @author JDamián
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Camion camion1= new Camion();
        System.out.println(camion1.getMatricula());
        camion1.setMatricula("2563JDH");
        System.out.println(camion1.getMatricula());
    }
    
}
