/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema04;
//1.13
/**
 *
 * @author JDamián
 */
public class Conversor{
    double tasaCambio;
    
    public Conversor(double tasa){
    tasaCambio = tasa;
    }
    public double dolarToEuro(double cantidadDolares){
    return cantidadDolares/tasaCambio;
    }
    public double euroToDolar(double cantidadEuros){
    return cantidadEuros*tasaCambio;
    }

    
}
