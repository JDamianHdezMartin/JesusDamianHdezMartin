/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DietaEjercicioPersona;

import java.util.Collection;
import java.util.Date;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 *
 * @author alumno
 */
public class Persona implements Comible, ActividadFisica{
    String nombre;
    double balanceCalorico;
    TreeMap<Date, Comible> comidas;
    TreeMap<Date, ActividadFisica> ejercicios;
    
    public void hacerEjercicio(Date fecha, ActividadFisica ejercicio){
        ejercicios.put(fecha, ejercicio);
    }
    public void getSaldoCalorico(Date fecha){
        double acumulado = 0;
        SortedMap<Date, Comible> headMap = comidas.headMap(new Date(fecha.getTime()+1000));
        Collection<Comible> comidasSubSet = headMap.values();
        for (Comible comible : comidasSubSet) {
            acumulado += comible.getCalorias();
        }
    }
    public void getHistorial(Date fechaInicio, Date fechaFin){
        
    }

    public double getCalorias(double calorias) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getExerciseCals() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getCalorias() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
