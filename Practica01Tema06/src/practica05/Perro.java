/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica05;

/**
 *
 * @author alumno
 */
public class Perro extends Animal{
    String pelaje;
    String colorPelaje;

    public Perro(String pelaje, String colorPelaje, String especie, String sonido, int numeroPatas) {
        super(especie, sonido, numeroPatas);
        this.pelaje = pelaje;
        this.colorPelaje = colorPelaje;
    }
    
}
