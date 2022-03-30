/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema03;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author JDamián
 */
public class PracticaExtraLotería {
/*Se generan 4 números aleatorios de 10 a 30
    Tomar por teclado la información que nos de el usuario de sus números comprados
en la lotería
    20, 28, 19, 11
    cada número apostado son 10€, mostrar lo gastado en total
    Una vez finalizado tiene la alternativa de volver a jugar.
    Para salir se escribirá: -1
    */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);      
        System.out.println("Bienvenido, ¿quiere jugar? pulse cualquier número"
                + " para jugar, pulse -1 para salir");
        int juego= sc.nextInt();
        while(juego!=-1){
            System.out.println("¿Cuántos números de lotería quieres poner?");
            int i= sc.nextInt();
            int[] numUsuario= new int[i];
            System.out.println("Introduce tus números entre 20 y 30");  
            int numIntroducido=sc.nextInt();
                if (numIntroducido>=20 && numIntroducido<=30){
                    numUsuario[i] = sc.nextInt();
                }
            if (Math.random());
             System.out.println("Ha gastado: "+i*10);
    }
    
}
