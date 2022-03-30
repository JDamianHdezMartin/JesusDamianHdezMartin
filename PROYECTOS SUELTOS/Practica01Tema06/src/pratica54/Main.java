/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratica54;

import java.lang.reflect.Array;
import java.util.List;
import java.util.stream.Collector;

/**
 *
 * @author daw
 */
public class Main {
    public static void main(String[] args) {
        Personas p1 = new Personas ("Jesús Damián", "Hernández Martín");
        
        personas.stream()
                .map(p->p.nombre)
                .map(nom->{
                    
                    String[] split1 = nom.split("");
                    List<String> caracteresNombre = Array.asList(split1);
                        return caracteresNombre;
                })
                .distinc()
                .collect(Collector.toList());
        System.out.println(collect);
                        });
}
