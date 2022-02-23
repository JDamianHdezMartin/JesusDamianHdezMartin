/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complejo;

/**
 *
 * @author JDamián
 */
public class Complejo {
    private double real;
    private double imag;
    
Complejo(double real){
    this.real=real;
    
}
Complejo(double real, double imag){
    this.real=real;
    this.imag=imag;
}
@Override
public String toString() {
    return "("+ real + ","+ imag + ')';
}
public suma(Complejo){
Complejo c1 = new Complejo(2,4);
Complejo c2 = new Complejo(1,3);
Complejo c3 = Complejo.suma(c1, c2);
return c3;
}
public resta(){
Complejo c1 = new Complejo(3,9);
Complejo c2 = new Complejo(1,4);
Complejo c3 = c1.resta(c2);
return c3;
}

    

}

