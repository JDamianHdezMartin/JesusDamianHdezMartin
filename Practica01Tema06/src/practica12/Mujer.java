/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica12;

/**
 *
 * @author alumno
 */
public class Mujer extends Persona{

    public Mujer(String nombre, String apellido1, String appellido2, int edad, int altura, double peso) {
        super(nombre, apellido1, appellido2, edad, altura, peso);
        
    }

    @Override
    double calcularPesoIdeal() {
        int k=2;
        double resultado=altura-100-((100-150)/k);
        return resultado;
    }
    
}
