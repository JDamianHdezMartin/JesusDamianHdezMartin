/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaExtra01;

import java.util.Comparator;
import java.util.TreeSet;

/**
 *
 * @author alumno
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo(10, 20);
        Rectangulo r2 = new Rectangulo(15, 15);
        Rectangulo r3 = new Rectangulo(20, 10);
        Rectangulo r4 = new Rectangulo(25, 5);

        TreeSet<Rectangulo> ordenArea;

        Comparator<Rectangulo> comparator = new Comparator<Rectangulo>() {
            @Override
            public int compare(Rectangulo r1, Rectangulo r2) {
                return Double.compare(r1.area(), r2.area());
            }
        };
        ordenArea = new TreeSet<Rectangulo>(comparator);
        ordenArea.add(r4);
        ordenArea.add(r3);
        ordenArea.add(r1);
        ordenArea.add(r2);
        
        for (Rectangulo rectangulo : ordenArea) {
            System.out.println(rectangulo);
            System.out.println("El área es: "+rectangulo.area());
        }
    }

}
