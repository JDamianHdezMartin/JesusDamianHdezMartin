/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema04;


public class ClassClienteHotel {
    private int id;
    private String nombre;
    private String apellido;
    private int habitacion;
    private double debe;
    private int noches;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(int habitacion) {
        this.habitacion = habitacion;
    }

    public double getDebe() {
        return debe;
    }

    public void setDebe(double debe) {
        this.debe = debe;
    }

    public int getNoches() {
        return noches;
    }

    public void setNoches(int noches) {
        this.noches = noches;
    }
    
    public double gastar(double debe){
        this.debe = debe;
        if (debe >= 0) {
            return debe;
        }else{
            System.out.println("error"); //debería hacerse un control de excepciones
        }
        return debe;
    }
    public double pagar (double pago){
        
        return pago;
    }
        

}


