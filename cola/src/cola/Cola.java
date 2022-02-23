/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cola;

/**
 *
 * @author JDamián
 */
public class Cola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
    }
    public String toString() {
        int array[]= {1,2,3,4,5};
        String respuesta= " ";
        String coma= "";
        for (int i = nextPorAtender; i < array.length-1; i++) {
            respuesta+= coma + array[i];
        }
    }
    
}
