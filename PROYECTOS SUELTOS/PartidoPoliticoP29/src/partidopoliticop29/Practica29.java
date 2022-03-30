/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package partidopoliticop29;

import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author JDamián
 */
public class Practica29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<Integer, Partido> partidos = new TreeMap<>();

        boolean salir = false;
        do {
            System.out.println("Introduzca el nombre del partido:");
            String nombrePartido = sc.nextLine();
            System.out.println("Introduzca el número de votos:");
            int numVotos = sc.nextInt();
            sc.nextLine();
            partidos.put(numVotos, new Partido(nombrePartido, numVotos));
            System.out.println("1.- Continuar");
            System.out.println("2.- Salir");
            int opcion = sc.nextInt();
            sc.nextLine();
            if (opcion == 2) {
                salir = true;
            }
        } while (!salir);

        System.out.println("Introduzca el límite inferior:");
        int limInferior = sc.nextInt();
        System.out.println("Introduzca el límite superior:");
        int limSuperior = sc.nextInt();

        System.out.println(partidos.subMap(limInferior, true, limSuperior, true));
    }
}
