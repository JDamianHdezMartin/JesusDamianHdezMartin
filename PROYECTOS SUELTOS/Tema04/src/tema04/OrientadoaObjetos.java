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
public class OrientadoaObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona paco = new Persona();
        Persona ana = new Persona();
        
        paco.setNombre("paco");
        paco.setApellido("Pérez");
        
        ana.setNombre("Ana");
        ana.setApellido("García");
        
        
        
        
        paco.mostrar();
        
    }
    
}
