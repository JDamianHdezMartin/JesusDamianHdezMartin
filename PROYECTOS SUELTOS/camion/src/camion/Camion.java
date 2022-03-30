/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package camion;

/**
 *
 * @author JDamián
 */
 class Camion {
    private String marca;
    private double potencia;
    private String matricula;
    Camion(){
    this("Nissan");
    this.potencia = 0.0;
    
    }
    Camion(String marca){
        this("Nissan",200,"asda");
        this.marca=marca;
        
    }
    Camion(String marca, double potencia, String matricula){
    this.marca=marca;
    this.potencia=potencia;
    this.matricula=matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }
    
    public String getMatricula() {
    return this.matricula; // return matricula; valdria tambien
    }
    public void setMatricula(String matricula) {
    //como matricula es un parametro que recibe el método se puede confundir
    //con el atributo matricula. Aqui es necesario this para diferenciar
    this.matricula = matricula;
        
    }
    
}


    
