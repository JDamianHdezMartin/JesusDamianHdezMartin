/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaExtra02;

/**
 *
 * @author alumno
 */

interface  TieneToValue{
    abstract double toValue();
    
}

class Persona1 extends Persona implements TieneToValue, Comparable<Persona>{
    int edad;

    public Persona1(String nombre, String apellido1, String apellido2, int edad, int altura, double peso) {
        super(nombre, apellido1, apellido2, edad, altura, peso);
    }
    @Override
    public double toValue(){
        return edad;
    }

    @Override
    double calcularPesoIdeal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int compareTo(Persona o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}



public class Interfaces {
    
    public static void ordenarArray(TieneToValue array[]){
        for (int i = 0; i < array.length; i++) {
            int posMax = i;
            for (int j = 0; j < array.length; j++) {
                if( array[j].toValue() > array[posMax].toValue()){
                    posMax = j;
                }
                
            }
            TieneToValue temp = array[i];
            array[i] = array[posMax];
            array[posMax] = temp;
            
        }
    }
    
    
    public static void main(String[] args) {
        TieneToValue array[] = new TieneToValue[10];
        array[0] = new Persona1();
        array[1] = new Persona1();
        ordenarArray(array);
    }
}
