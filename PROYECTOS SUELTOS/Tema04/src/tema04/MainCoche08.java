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
public class MainCoche08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public String apagar () {
        String respuesta = "";
        if (this.apagar()) {
            respuesta = "error, ya está apagado";
        }else{
            respuesta = "coche apagado";
        }
        return respuesta;
    }
        Coche coches[] = new Coche[10];
        
        for (int i = 0; i<coches.length; i++) {
            coches[i] = new Coche("coche"+i,i);
            
        }
}
    

