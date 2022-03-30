/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generalclase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

/**
 *
 * @author JDamián
 */
/**public class NewMain {
    public static void mostrarArray(String[] args) {
        System.out.println("[");
    }
    
    /**
     * @param args the command line arguments
     */
    /**public static void main(String[] args) {
                int array[][] = new int[3][];
        
        array[0] = new int[3];
        array[1] = new int[2];
        array[2] = new int[4];
        
        
        /*int k=0;
        for (int i = 0; i < array.length; i++) {
            int[] fila = array[i];
          
            for (int j = 0; j < fila.length; j++) {
                array[i][j] = ++k;
            }
        }        
        */
        
       /** for (int[] fila : array) {
           for (int dato : fila) {
                System.out.print( dato + " ");
            }
            System.out.println("");
        }
        
    }
    }
    
**/
public class NewMain{
    public static void main(String[] args) {
HashMap<String,Double> t=new HashMap<String,Double>();
t.put("Ana", 9.2);
t.put("Luis", 8.5);
t.put("Marta", 6.0);
t.put("Marco", 5.5);
t.put("Lidia",8.0);
Iterator it = t.entrySet().iterator();
while (it.hasNext()) {
Map.Entry<String, Double> entry = (Map.Entry<String, Double>) it.next();
System.out.println("Clave="+entry.getKey()+", Valor="+entry.getValue());
// it.remove();
}}}

    

