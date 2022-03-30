/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coche;

import java.util.HashSet;

/**
 *
 * @author JDamián
 */
public class Escenario {
    
    private String pista[];
    private HashSet<Coche> coches;
    
    public Escenario(int size){
        pista = new String[size];
        coches = new HashSet<Coche>();
        limpiarEscenario();
    }
   
    public boolean choque(Coche c){
        boolean hayChoque = false;
        if( coches.contains(c)){
            for (Coche coche : coches) {
                if( coche != c ){
                    if( coche.getPosicion() == c.getPosicion()){
                        hayChoque = true;
                        break;
                    }
                        
                }
            }
        }
    }
    
    
    public String getPosPista(int n){
        return pista[n];
    }
    
    private void limpiarEscenario(){
        for (int i = 0; i < pista.length; i++) {
            pista[i] = "_ ";
        }
    }
    
    @Override
    public String toString(){
        String resultado = "";
        
        for( Coche coche : coches){
            pista[coche.getPos()] = coche.toString().substring(1,2);
        }
        for (int i = 0; i < pista.length; i++) {
            resultado += pista[i];
        }
        return resultado;
    }
    
    public boolean agregarCoche(Coche c){
        boolean ok = true;
        if( coches.contains(c)){
            ok = false;
        }else{
            coches.add(c);
        }
        
        
        return ok;
    }
    
    public void mostrarPista(){
        for (int i = 0; i < pista.length; i++) {
            System.out.print(pista[i]);
        }
        System.out.println("");
    }
    
   
}

}
