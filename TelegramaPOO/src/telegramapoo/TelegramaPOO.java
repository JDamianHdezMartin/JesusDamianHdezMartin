
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telegramapoo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author JDamián
 */
public class TelegramaPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Diga cuantos telegramas quiere enviar: ");
        int numTelegramas = sc.nextInt();

        ArrayList<Telegrama> arrTelegram = new ArrayList<>(numTelegramas);

        double precioPalabra = 0.10;
        //suponiendo que se registran X números de telegramas      
        for (int i = 1; i <= numTelegramas; i++) {
            sc = new Scanner(System.in);
            String remitente, receptor, texto;
            System.out.println("Introduzca el remitente: ");
            remitente = sc.nextLine();
            System.out.println("Introduzca el receptor: ");
            receptor = sc.nextLine();
            System.out.println("Introduce el texto a enviar: ");
            texto = sc.nextLine();
            //creación del objeto telegrama
            Telegrama tActual = new Telegrama(texto, remitente, receptor, precioPalabra);
            System.out.println("Coste del telegrama: " + tActual.coste());
            arrTelegram.add(tActual);
        }
        /*Collections.sort(arrTelegram);
        for (Telegrama t : arrTelegram) {
            System.out.println(t);
        }*/
    }

}
