/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telegramapoo;

/**
 *
 * @author JDamián
 */
public class Telegrama{
    //atributos
    String texto;
    String remitente;
    String receptor;
    double precioPalabra;
    int palabras;
    
    //método constructor
    public Telegrama(String texto, String remitente, String receptor, 
            double precioPalabra){
        
        this.texto=texto;
        this.remitente=remitente;
        this.receptor=receptor;
        this.precioPalabra=precioPalabra;
        //Por norma se considera a palabra un conjunto de 5 caracteres
        //a la hora de redactar telegramas
        this.palabras= (int)texto.length()/5;
               
    }
    //método para pasar el texto introducido a String

    @Override
    public String toString() {
        return "Telegrama{" +" remitente=" + remitente +
                ", receptor=" + receptor + " texto=" + texto +'}';
    }
    
    
    
    //método que determina el coste por palabra
    public double coste(){
        System.out.println("El coste es: ");
        return palabras*precioPalabra;
        
        
    
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    public String getReceptor() {
        return receptor;
    }

    public void setReceptor(String receptor) {
        this.receptor = receptor;
    }

    public double getPrecioPalabra() {
        return precioPalabra;
    }

    public void setPrecioPalabra(double precioPalabra) {
        this.precioPalabra = precioPalabra;
    }
}
    
    

