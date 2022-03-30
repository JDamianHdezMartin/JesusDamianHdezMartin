/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numaleatorio;

/**
 *
 * @author JDamián
 */
public class NumAleatorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Aleatorio a1 = new Aleatorio(valorMax, valorMin);
            
    for(int i = valorMin; i <= valorMax; i++) {
            int obtenerAleatorio = (int) (Math.random()*(valorMax-valorMin)) + valorMin;
            System.out.println(obtenerAleatorio);

		}
        

           }
}




