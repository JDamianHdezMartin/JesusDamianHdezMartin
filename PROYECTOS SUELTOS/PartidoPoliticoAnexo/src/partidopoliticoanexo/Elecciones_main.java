/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package partidopoliticoanexo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Elecciones_main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean continuar = true;
        System.out.print("dame el año de la elección:");
        int year = sc.nextInt();
        sc.nextLine();
        System.out.print("define las  elecciones:");
        String nombre = sc.nextLine();
        System.out.println("");
        Elecciones eleccion = new Elecciones(nombre, year, 350);
        int opcion = 0;
        while (continuar) {
            System.out.println("\nMenú");
            System.out.println("1) Agregar partido");
            System.out.println("2) mostrar resultados ordenados por diputados");
            System.out.println("3) buscar un partido");
            System.out.println("4) salir");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Dame el nombre del partido");
                    String nom = sc.nextLine();
                    System.out.println("Votos que tuvo:");
                    int votos = sc.nextInt();
                    sc.nextLine();
                    Elecciones.Partido p = eleccion.new Partido(nom, votos);
                    eleccion.add(p.nombre, p);
                    break;
                case 2:
                    System.out.println("El partido "+
                            eleccion.getPartidos()
                    );

                    break;
                case 3:
                    System.out.println("dame el nombre");
                    String n = sc.nextLine();
                    Elecciones.Partido mipartido = eleccion.get(n);
                    System.out.println(mipartido);
                    break;
                case 4:
                    continuar = false;
                    break;
            }

        }
 
    }
        public void add(String nombre, int votos){
      
      this.add(nombre,new Partido(nombre,votos));
    }

    public void add(String nombre, Partido p) {

        partidosMapNombre.put(nombre, p); 
        partidosOrdenVotos.add(p);
        dhont();
       
    }

    private void dhont() {
        
        ArrayList>
        
        
        
        
        
    }
    private void proporcional(){
    int diputados=5;
    Partido A = new Partido ("partidoA", 200);
    Partido B = new Partido ("partidoB", 100);
    Partido C = new Partido ("partidoC", 50);
    double totalVotos = A.votos + B.votos + C.votos;
    
    double costeDiputados= totalVotos/diputados;
    
        System.out.println(A.diputados=(int)(A.votos/costeDiputados));
        System.out.println(B.diputados=(int)(B.votos/costeDiputados));
        System.out.println(C.diputados=(int)(C.votos/costeDiputados));
    
        
    }

 
    
}