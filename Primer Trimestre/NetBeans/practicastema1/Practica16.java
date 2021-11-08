/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicastema1;
import java.util.Scanner;
/**
 *
 * @author JDamian Hdez Martin
 */
public class Practica16 {
    public static void main(String[] args) {
        
        System.out.print("Introduzca los datos del rectángulo");
        System.out.println("Damelos en cm");
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca la base del rectángulo");
        int baseEnCm = sc.nextInt();
        double baseEnM = baseEnCm / 100.0;
        
        System.out.println("Introduca la altura del rectángulo");
        int alturaEnCm = sc.nextInt();
        double alturaEnM = alturaEnCm / 100.0;
        
        double areaEnM = baseEnM * alturaEnM;
        int areaEnCm = baseEnCm * alturaEnCm;
        
        System.out.println("El área de su rectángulo es: " + areaEnCm + "cm²" + areaEnM + "m²");
        
    }
}
