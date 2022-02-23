/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generalclase;

/**
 *
 * @author JDamián
 */
public class GeneralClase {

    //int almacen [][] = {{5,1,3,2},{9,0,7,8},{4,6,10,2}};
    
    /**
     * @param args the command line arguments
     */
    /**public static void main(int arr[]) {
        System.out.print("[");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i]+ " ");   
        }
        System.out.println("]");
    }*/
    public static void main(int array[][]) {
        array[][] = new int[3][];
        array[0] = new int[3];
        array[1] = new int[2];
        array[2] = new int[4];
        for (int[] is : array) {
            System.out.println(is);
        }
    }
}
