/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicastema1;

/**
 *
 * @author JDamian Hdez Martin
 */
public class Practica00 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Hola Mundo");
        
        int numero;
        numero = 5;
        
        int numero2;
        numero2 = 7;
        Integer num;
        
        String texto = "esto es un texto";
        
        char letra = 'a';
        
        for (int i = 97; i <= 'z'; i++) {
            System.out.println((char)i);
        }
        
        System.out.println(1234 == 1234L);
        
        int numero4 = 0x10;
        System.out.println(numero4);
        
        System.out.println(067);
        
        System.out.println("Pulsa \"C\" para continuar");
        
        System.out.println((int)'0');
        
        float c = 12.56f;
        
        int a = 7;
        a++;
        System.out.println(a);
        a--;
        System.out.println(a);
        
        int i = 2, j = 2;
        int k = i++;
        int l = ++j;
        System.out.println(k);
        System.out.println(l);
        System.out.println(i);
        System.out.println(j);
        
        int w = 3;
        i += 7;
        System.out.println(i);
        
        int h = 3;
        h %= 3;
        System.out.println(h);
        
    }
    
}
