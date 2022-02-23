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
public class Practica12 {

    String marca;
    double potencia;
    String matricula;
    class Camion {
   private String marca;
   private double potencia;
   private String matricula;
   public String getMatricula() {
      return this.matricula;  // return matricula;  valdria tambien
   }
   public int setMatricula(String matricula) {
      //como matricula es un parametro que recibe el método se puede confundir 
      //con el atributo matricula. Aqui es necesario  this para diferenciar
      this.matricula = matricula;
       
   }
   public String marca(String marca){
       this.marca= marca;
       return this.marca;   
   }
   public double potencia(int potencia){
       this.potencia=potencia;
       return this.potencia;
   }
   
    }
    
    
    }

