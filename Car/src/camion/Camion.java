/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package camion;

/**
 * 
 * @author JDamián
 * @param <T> 
 */
public class Camion<T> {
    //T se usa como "Type"
    //T puede ser usada como type String como CocheNombre
    //también T puede ser usada como type Integer como NumModelo,
    //o T también puede ser type Object como una instancia de coche.
    public T carga;

   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Camion<String> camion = new Camion<String>();
        camion.carga = "hola Damián";
        
        Camion<Integer> camInt = new Camion<Integer>();
        camInt.carga = 34;
    }
    
}
