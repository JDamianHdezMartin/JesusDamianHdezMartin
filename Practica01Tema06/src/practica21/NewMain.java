/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica21;

/**
 *
 * @author alumno
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mujer nuevaMujer = new Mujer("Isabel", "Dorta", "Jiménez", 45, 165, 60);
        ImprimirMayuscula <Mujer> iem = new ImprimirMayuscula<Mujer>() {
            @Override
            public void imprimirMayuscula(Mujer mujer) {
                String val = mujer.toString();
                System.out.println(val.toUpperCase());
            }
        };
        iem.imprimirMayuscula(nuevaMujer);
        
    }

}
