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
public class Persona {
   public String nombre;
   private String apellido;
   private int edad;
   public String getNombreCompleto() {
      return nombre +" " + apellido;
   }
   public int getEdad() {
      return edad;
   }
   public void setNombre(String txt) {
      nombre = txt;
   }   
   public void setApellido(String txt) {
      apellido = txt;
   }
   public void setEdad(int n){
      edad = n;
   }
   public void setDatos(String n, String a, int e){
       edad = e;
       nombre = n;
       apellido = a;
   }
   public void mostrar() {
            System.out.println(nombre + " " + apellido+ " "+edad);
}}

       
   

   



