/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosTipoExamen.Proyectil;

/**
 *
 * @author daw
 */
class Proyectil{
    double peso;
    double energia;
    
    Vector direccion;
}

class Vector{
    Punto origen;
    Punto fin;
}

class Punto{
    double x;
    double y;
}       
