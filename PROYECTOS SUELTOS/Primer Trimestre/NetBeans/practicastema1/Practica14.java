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
public class Practica14 {
    public static void main(String[] args) {
        
        int x = 3, y = 4;
        int z = !(x <= y) ? x : y;
        System.out.println(z);
        //En este caso nos muestra un 4
        //Ya que, para Z, en casop de que X sea menor o igual que Y
        //Esta mandará el valor true, por lo que escogerá la primera opción
        //Mostrándonos el valor de X. En caso contrario, muestra el valor de Y
        
        //En estos casos podemos observar el ejemplo más simplificado
        System.out.println(5 > 3);
        //Dado que esta afirmación es cierta, nos devuelve el valor True
        
        System.out.println(5 < 3);
        //Dado que esta afirmación es falsa, nos devuelve el valor False
        
    }
}
