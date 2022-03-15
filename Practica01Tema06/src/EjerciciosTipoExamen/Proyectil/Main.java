/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosTipoExamen.Proyectil;

import java.util.Optional;

/**
 *
 * @author daw
 */
public class Main {
    public static void main(String[] args) {
        Proyectil unproyectil = null;
        
        Optional<Proyectil> optMiproyectil = Optional.ofNullable(unproyectil);
        
        optMiproyectil.map(proy->proy.direccion)
                .map(dir->dir.origen)
                .ifPresent(System.out::println);
        
        Optional<Vector> optDireccion = optMiproyectil.map(p-> p.direccion);
        
        Optional<Punto> optPunto = optDireccion.map(dir-> dir.origen);
        optPunto.ifPresent(System.out::println);
        
        if (unproyectil != null) {
            if (unproyectil.direccion !=null) {
                if (unproyectil.direccion.origen !=null) {
                    System.out.println(unproyectil.direccion.origen);
                }
                
            }
        }
    }
}
