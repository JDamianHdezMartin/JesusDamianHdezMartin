/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fracciones;

/**
 *
 * @author JDamián
 */

class Fraccion{
int numerador;
int denominador;

    public Fraccion (int numerador, int denominador) throws Exception {
        int mcd = mcd ( numerador, denominador);
        this.numerador = numerador/mcd;
        this.denominador= denominador/mcd;
        if (denominador ==0) {
            throw new Exception ("no es posible denominador = 0");
        }
    }
    
       private int mcd(int n1, int n2){
        int resultado = 1;
        int dividendo = n1;
        int divisor = n2;
        int resto;
        
        do{
            resto = dividendo % divisor;
            resultado = divisor;
            dividendo = divisor;
            divisor = resto;
        }while(resto != 0);
        
        
        return resultado;
    } 
}
public class Fracciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
