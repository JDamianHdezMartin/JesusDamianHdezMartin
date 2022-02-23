/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica10;

/**
 *
 * @author alumno
 */
public abstract class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Animal a1 = new Animal("Damián", 23, 95 ) {};
    }
    private abstract String emitirSonido();
}
