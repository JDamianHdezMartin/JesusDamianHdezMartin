/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioalmacen;
import java.util.ArrayList;

/**
 *
 * @author alumno
 */
public class Almacen implements Interfaz{
    double capacidad;
    double precioHoraKilogramos;
    Integer identificador;
    double dineroPagarAlquiler;
    ArrayList<String> almacen;

    public Almacen(double capacidad, double precioHoraKilogramos) {
        this.capacidad = capacidad;
        this.precioHoraKilogramos = precioHoraKilogramos;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public double getPrecioHoraKilogramos() {
        return precioHoraKilogramos;
    }

    public void setPrecioHoraKilogramos(double precioHoraKilogramos) {
        this.precioHoraKilogramos = precioHoraKilogramos;
    }

    public Integer getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Integer identificador) {
        this.identificador = identificador;
    }

    public ArrayList<String> getAlmacen() {
        return almacen;
    }

    public void setAlmacen(ArrayList<String> almacen) {
        this.almacen = almacen;
    }

    @Override
    public void guardar(Pesable producto) {
        producto.getPeso();
        
    }

    @Override
    public void pagar(Almacen identificador, Almacen dineroPagarAlquiler) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
