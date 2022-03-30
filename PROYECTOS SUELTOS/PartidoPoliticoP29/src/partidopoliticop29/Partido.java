/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package partidopoliticop29;

/**
 *
 * @author JDamián
 */
class Partido{
    private String nombre;
    private int votos;
    
    public Partido(String nombre, int votos){
        this.nombre = nombre;
        this.votos = votos;
    }
    
    @Override 
    public String toString(){
        return nombre;
    }
    
    public int getVotos(){
        return votos;
    }
    
    public String getNombre(){
        return nombre;
    }
}