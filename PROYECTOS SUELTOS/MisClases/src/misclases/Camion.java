/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misclases;

/**
 *
 * @author alumno
 */
 public class Camion {
    private String marca;
    private double potencia;
    String matricula;
    Camion(){
    this.marca = "";
    this.potencia = 0.0;
    this.matricula="";
    }
    Camion(String marc){
        this.marca=marc;
        
    }
    Camion(String marc, double potenc, String matricu){
    this.marca=marc;
    this.potencia=potenc;
    this.matricula=matricu;
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
    public int setMatricula(String matricula) {
    //como matricula es un parametro que recibe el método se puede confundir
    //con el atributo matricula. Aqui es necesario this para diferenciar
    this.matricula = matricula;
        return 0;
    }
}

    